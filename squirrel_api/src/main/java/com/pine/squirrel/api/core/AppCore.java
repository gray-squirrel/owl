package com.pine.squirrel.api.core;

import com.pine.squirrel.infra.dao.service.AppDAO;
import com.pine.squirrel.infra.dao.service.TenantAppRelaDAO;
import com.pine.squirrel.infra.utils.IdUtils;
import com.pine.squirrel.lib.dbdo.AppDO;
import com.pine.squirrel.lib.dbdo.TenantAppRelaDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author 赵松
 * @date 2020/1/5
 */
@Component
public class AppCore {

    @Autowired
    private AppDAO appDAO;
    @Autowired
    private TenantAppRelaDAO tenantAppRelaDAO;

    @Transactional(rollbackFor = Exception.class)
    public void addApp(@Validated AppDO appDO, @NotNull String tenantId) {
        appDAO.addApp(appDO);

        TenantAppRelaDO tenantAppRelaDO=new TenantAppRelaDO();
        tenantAppRelaDO.setId(IdUtils.generateId(tenantId));
        tenantAppRelaDO.setAppId(appDO.getId());
        tenantAppRelaDO.setGmtCreate(new Date());
        tenantAppRelaDO.setGmtModify(new Date());
        tenantAppRelaDAO.addRela(tenantAppRelaDO);

    }

    public AppDO getAppByName(String appName) {
        Assert.notNull(appName,"app name is null!");
        return appDAO.getAppByName(appName);
    }
}
