package com.pine.squirrel.api.core;

import com.pine.squirrel.infra.dao.service.TenantUserRelaDAO;
import com.pine.squirrel.infra.dao.service.UserDAO;
import com.pine.squirrel.infra.utils.IdUtils;
import com.pine.squirrel.lib.dbdo.TenantUserRelaDO;
import com.pine.squirrel.lib.dbdo.UserDO;
import com.pine.squirrel.lib.enums.TenantUserRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author 赵松
 * @date 2020/1/5
 */
@Component
public class UserCore {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private TenantUserRelaDAO tenantUserRelaDAO;

    @Transactional(rollbackFor = Exception.class)
    public void addUser(@Validated UserDO userDO,@NotNull String tenantId,@NotNull TenantUserRoleEnum role) {
        userDAO.addUser(userDO);
        TenantUserRelaDO rela=new TenantUserRelaDO();
        rela.setId(IdUtils.generateId(tenantId));
        rela.setTenantId(tenantId);
        rela.setUserId(userDO.getId());
        rela.setGmtCreate(new Date());
        rela.setGmtModify(new Date());
        rela.setRole(role.name());
        tenantUserRelaDAO.addRela(rela);
    }
}
