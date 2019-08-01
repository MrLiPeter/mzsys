package com.mz.service;

import com.mz.mapper.ItemMapper;
import com.mz.pojo.Item;
import com.mz.vo.EasyUIItemtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/31
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemMapper itemMapper;

    public EasyUIItemtable queryItemList(Integer page,Integer rows){

        Integer total = itemMapper.selectCount(null);
        Integer start = (page-1)*rows;
        List<Item> items = itemMapper.findLimitItemList(start, rows);
        return new EasyUIItemtable(total,items);

    }
}
