package com.mz.controller;

import com.mz.service.ItemService;
import com.mz.vo.EasyUIItemtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/31
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/query")
    public EasyUIItemtable queryItemList(Integer page,Integer rows){
        return itemService.queryItemList(page,rows);
    }

}
