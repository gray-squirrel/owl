package com.pine.squirrel.api.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;

import com.pine.squirrel.infra.dao.service.TenantDAO;
import com.pine.squirrel.lib.dbdo.TenantDO;

/**
 * @author 赵松
 * @date 2020/1/5
 */
@Component
public class TenantCore {


    @Autowired
    private TenantDAO tenantDAO;

    public void addTenant(@Validated TenantDO tenantDO){
        tenantDAO.addTenant(tenantDO);
    }

    public TenantDO getTenantByName(String tenantName) {
        Assert.notNull(tenantName,"tenant name is null!");
        return tenantDAO.getTenantByName(tenantName);
    }
}
