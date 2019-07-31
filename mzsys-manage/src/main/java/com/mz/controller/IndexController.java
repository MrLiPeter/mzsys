package com.mz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/30
 */
@Controller
public class IndexController {
    @RequestMapping("/page/{moduleName}")
    public String module(@PathVariable String moduleName){
//        System.out.println("来了老弟");
        return moduleName;
    }
}
