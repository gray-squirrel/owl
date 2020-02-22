package com.pine.squirrel.api.service;

import com.pine.squirrel.api.core.UserCore;
import com.pine.squirrel.lib.enums.TenantUserRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.pine.squirrel.infra.utils.IdUtils;
import com.pine.squirrel.lib.dbdo.UserDO;
import com.pine.squirrel.lib.input.UserAddInput;

/**
 * @author 赵松
 * @date 2020/1/5
 */
@Component
public class UserService {

    @Autowired
    private UserCore userCore;


    public String addUser(@Validated UserAddInput userAddInput){
        UserDO userDO=new UserDO();
        userDO.setEmail(userAddInput.getEmail());
        userDO.setName(userAddInput.getName());
        userDO.setPasswd(userAddInput.getPasswd());
        String id= IdUtils.generateId(userAddInput.getTenantId());
        userDO.setId(id);
        userCore.addUser(userDO,userAddInput.getTenantId(), TenantUserRoleEnum.valueOf(userAddInput.getRole()));
        return id;
    }
}
