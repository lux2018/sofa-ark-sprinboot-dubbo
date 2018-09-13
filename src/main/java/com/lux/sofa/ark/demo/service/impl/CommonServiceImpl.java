package com.lux.sofa.ark.demo.service.impl;

import com.lux.sofa.ark.demo.service.CommonService;
import org.springframework.stereotype.Service;

/**
 * @author lux
 * @Title: CommonServiceImpl
 * @ProjectName sofa-ark-demo
 * @Description:
 * @date 2018/9/1320:11
 */

@Service
public class CommonServiceImpl implements CommonService {


    @Override
    public String getCommonClassloaderInfo(String name) {
        StringBuffer sbf = new StringBuffer();
        sbf.append(("Name---->"+name));
        sbf.append(("ClassloadInfo---->"+this.getClass().getClassLoader()));
        System.out.println("ClassloadInfo---->"+this.getClass().getClassLoader());
        return sbf.toString();
    }

}
