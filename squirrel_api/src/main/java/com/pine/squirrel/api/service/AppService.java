package com.pine.squirrel.api.service;

import com.pine.squirrel.api.core.AppCore;
import com.pine.squirrel.infra.utils.IdUtils;
import com.pine.squirrel.lib.dbdo.AppDO;
import com.pine.squirrel.lib.input.AppAddInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

/**
 * @author 赵松
 * @date 2020/1/5
 */
@Component
public class AppService {

    @Autowired
    private AppCore appCore;

    public String addApp(@Validated AppAddInput appAddInput){
        String id= IdUtils.generateId(appAddInput.getTenantId());
        AppDO appDO=new AppDO();
        appDO.setId(id);
        appDO.setName(appAddInput.getName());
        appDO.setGmtCreate(new Date());
        appDO.setGmtModify(new Date());
        appCore.addApp(appDO,appAddInput.getTenantId());
        return  id;
    }
}
