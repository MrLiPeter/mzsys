package com.mz.controller;

import com.mz.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/31
 */
@RestController
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/queryItemName")
    public String queryCatNameById(Integer itemCatId){

        return itemCatService.queryCatNameById(itemCatId);
    }
}
