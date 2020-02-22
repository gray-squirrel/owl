package com.pine.squirrel.api.controller;

import com.pine.squirrel.api.service.TenantService;
import com.pine.squirrel.lib.input.TenantAddInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 赵松
 * @date 2020/1/14
 */
@RestController
@ResponseBody
public class TenantController {

    @Autowired
    private TenantService tenantService;

    /**
     * add tenant
     * @param tenantAddInput
     */
    public String addTenant(@RequestBody TenantAddInput tenantAddInput) {
        return tenantService.addTenant(tenantAddInput);
    }

}
