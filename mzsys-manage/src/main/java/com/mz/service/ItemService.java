package com.mz.service;

import com.mz.vo.EasyUIItemtable;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/31
 */
public interface ItemService {
    EasyUIItemtable queryItemList(Integer page,Integer rows);
}
