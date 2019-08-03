package com.mz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mz.mapper.ItemCatMapper;
import com.mz.pojo.ItemCat;
import com.mz.vo.EasyUIItemtable;
import com.mz.vo.EasyUITree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/8/1
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public String queryCatNameById(Integer itemCatId) {
        ItemCat itemCat = itemCatMapper.selectById(itemCatId);
        return itemCat.getName();
    }

    public List<ItemCat> findItemCatList(Long parentId){
        List<EasyUITree> threeList  = new ArrayList<>();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("parent_id",parentId);
        return itemCatMapper.selectList(queryWrapper);
    }

    /**
     * EasyUITree VO对象
     *   依赖
     * ItemCat	  数据库对象
     * 思路:
     * 	1.先查询数据库List信息
     *  2.将数据库对象转化为VO对象.
     */
    @Override
    public List<EasyUITree> queryItemCatList2Three(Long parentId) {

        List<ItemCat> itemCatList = findItemCatList(parentId);
        List<EasyUITree> treeList = new ArrayList<>();
        for (ItemCat itemCat : itemCatList){
            String state = itemCat.getIsParent() ? "closed":"open";
            EasyUITree easyUITree = new EasyUITree(itemCat.getId(),itemCat.getName(),state);
            treeList.add(easyUITree);
        }
        return treeList;
    }
}
