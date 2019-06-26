package com.tangcz.licensingservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author 月汐
 * @date 2019/06/20 14:44
 */
@Entity
@Table(name = "licenses")
public class License {

    @Id
    @Column(name = "license_id", nullable = false)
    private String licenseId;

    @Column(name = "organization_id", nullable = false)
    private String organizationId;

    @Transient
    private String organizationName = "";

    @Transient
    private String contactName = "";

    @Transient
    private String contactPhone = "";

    @Transient
    private String contactEmail = "";

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "license_type", nullable = false)
    private String licenseType;

    @Column(name = "license_max", nullable = false)
    private String licenseMax;

    @Column(name = "license_allocated", nullable = false)
    private String licenseAllocated;

    @Column(name = "comment")
    private String comment;

    public String getLicenseId() {
        return licenseId;
    }

    public License setLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public License setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public License setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    public String getContactName() {
        return contactName;
    }

    public License setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public License setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public License setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public License setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public License setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    public String getLicenseMax() {
        return licenseMax;
    }

    public License setLicenseMax(String licenseMax) {
        this.licenseMax = licenseMax;
        return this;
    }

    public String getLicenseAllocated() {
        return licenseAllocated;
    }

    public License setLicenseAllocated(String licenseAllocated) {
        this.licenseAllocated = licenseAllocated;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public License setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
