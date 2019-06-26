package com.tangcz.organizationservice.repository;

import com.tangcz.organizationservice.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 月汐
 * @date 2019/06/26 20:24
 */
@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {

    /**
     * 通过ID查询
     * @param organizationId ID
     * @return Organization
     */
    Organization findByOrganizationId(String organizationId);

}
