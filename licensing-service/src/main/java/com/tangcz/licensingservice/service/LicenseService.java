package com.tangcz.licensingservice.service;

import com.tangcz.licensingservice.clients.OrganizationFeignClient;
import com.tangcz.licensingservice.config.ServiceConfig;
import com.tangcz.licensingservice.model.License;
import com.tangcz.licensingservice.model.Organization;
import com.tangcz.licensingservice.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author 月汐
 * @date 2019/06/20 16:47
 */
@Service
public class LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    @Autowired
    private ServiceConfig serviceConfig;
    @Autowired
    private OrganizationFeignClient organizationFeignClient;

    public License getLicense(String organizationId, String licenseId) {
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
        return license.setComment(serviceConfig.getExampleProperty());
    }

    public License getLicense(String organizationId, String licenseId, String clientType) {
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);

        Organization org = retrieveOrgInfo(organizationId, clientType);

        return license
                .setOrganizationId(org.getId())
                .setContactEmail(org.getContactEmail())
                .setContactName(org.getContactName())
                .setContactPhone(org.getContactPhone())
                .setComment(serviceConfig.getExampleProperty());
    }

    public List<License> getLicensesByOrg(String organizationId) {
        return licenseRepository.findByOrganizationId(organizationId);
    }

    public void saveLicense(License license) {
        license.setLicenseId(UUID.randomUUID().toString());
        licenseRepository.save(license);
    }

    public void updateLicense(License license) {
        licenseRepository.save(license);
    }

    public void deleteLicense(License license) {
        licenseRepository.delete(license);
    }

    private Organization retrieveOrgInfo(String organizationId, String clientType) {
        Organization organization = null;

        switch (clientType) {
            case "feign":
                System.out.println("I am using the feign client");
                organization = organizationFeignClient.getOrganization(organizationId);
                break;
            default:
                organization = new Organization();
        }

        return organization;
    }

}
