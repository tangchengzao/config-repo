package com.tangcz.licensingservice.clients;

import com.tangcz.licensingservice.model.Organization;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 月汐
 * @date 2019/06/24 19:33
 */
@FeignClient("organizationService")
public interface OrganizationFeignClient {

    /**
     * 获取organization
     * @param organizationId id
     * @return Organization
     */
    @RequestMapping(method = RequestMethod.GET, value = "/v1/organizations/{organizationId}", consumes = "application/json")
    Organization getOrganization(@PathVariable("organizationId") String organizationId);

}
