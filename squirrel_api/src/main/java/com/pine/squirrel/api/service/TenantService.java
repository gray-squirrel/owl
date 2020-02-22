package com.pine.squirrel.api.service;

import com.pine.squirrel.lib.dbdo.TenantDO;
import org.springframework.beans.factory.annotation.Autowired;

import com.pine.squirrel.api.core.TenantCore;
import com.pine.squirrel.infra.utils.IdUtils;
import com.pine.squirrel.lib.input.TenantAddInput;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

/**
 * @author 赵松
 * @date 2020/1/5
 */
public class TenantService {

    @Autowired
    private TenantCore tenantCore;


    /**
     * add tenant
     * @param tenantAddInput
     * @return
     */
    public String addTenant(@Validated TenantAddInput tenantAddInput){
        String id= IdUtils.generateId();
        TenantDO tenantDO=new TenantDO();
        tenantDO.setName(tenantAddInput.getName());
        tenantDO.setId(id);
        tenantDO.setGmtCreate(new Date());
        tenantDO.setGmtModify(new Date());
        tenantCore.addTenant(tenantDO);
        return id;
    }
}
