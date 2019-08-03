package com.mz.service;

import com.mz.pojo.Item;
import com.mz.pojo.ItemDesc;
import com.mz.vo.EasyUIItemtable;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/31
 */
public interface ItemService {
    EasyUIItemtable queryItemList(Integer page,Integer rows);

    void saveItem(Item item, ItemDesc itemDesc);
    ItemDesc queryItemDescByItemId(Long itemId);

    void updateItem(Item item, ItemDesc itemDesc);

    void instockItems(Long[] ids);

    void reshelfItems(Long[] ids);

    void deleteItems(Long[] ids);
}
