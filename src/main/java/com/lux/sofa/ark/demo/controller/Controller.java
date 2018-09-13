package com.lux.sofa.ark.demo.controller;

import com.lux.sofa.ark.demo.service.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lux
 * @Title: Controller
 * @ProjectName sofa-ark-demo
 * @Description: TODO
 * @date 2018/9/1319:53
 */

@RestController
public class Controller {
    @Autowired
    private CommonService commonService;


    @RequestMapping(value = "/base")
    public String base(){
        return commonService.getCommonClassloaderInfo("base");
    }
}
