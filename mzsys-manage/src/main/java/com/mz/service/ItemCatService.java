package com.mz.service;

import com.mz.vo.EasyUITree;

import java.util.List;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/8/1
 */
public interface ItemCatService {

    String queryCatNameById(Integer itemCatId);
    List<EasyUITree> queryItemCatList2Three(Long parentId);

}
