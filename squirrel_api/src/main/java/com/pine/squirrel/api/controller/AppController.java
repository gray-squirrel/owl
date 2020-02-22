package com.pine.squirrel.api.controller;

import com.pine.squirrel.api.service.AppService;
import com.pine.squirrel.lib.input.AppAddInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pine.squirrel.api.service.TenantService;
import com.pine.squirrel.lib.input.TenantAddInput;

/**
 * @author 赵松
 * @date 2020/1/14
 */
@RestController
@ResponseBody
public class AppController {

    @Autowired
    private AppService appService;

    /**
     * add app
     * @param appAddInput
     */
    public String addApp(@RequestBody AppAddInput appAddInput) {
        return appService.addApp(appAddInput);
    }

}
