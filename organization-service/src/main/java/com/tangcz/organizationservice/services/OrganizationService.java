package com.tangcz.organizationservice.services;

import com.tangcz.organizationservice.model.Organization;
import com.tangcz.organizationservice.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author 月汐
 * @date 2019/06/26 20:43
 */
@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization getOrg(String organizationId) {
        return organizationRepository.findByOrganizationId(organizationId);
    }

    public void saveOrg(Organization organization) {
        organization.setOrganizationId(UUID.randomUUID().toString());
        organizationRepository.save(organization);
    }

    public void updateOrg(Organization organization) {
        organizationRepository.save(organization);
    }

    public void deleteOrg(Organization organization) {
        organizationRepository.delete(organization);
    }

}
