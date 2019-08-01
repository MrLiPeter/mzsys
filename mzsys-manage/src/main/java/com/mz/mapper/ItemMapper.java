package com.mz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mz.pojo.Item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/30
 */
public interface ItemMapper extends BaseMapper<Item> {

    @Select("select *from tb_item order by updated desc limit #{start},#{rows}")
    List<Item> findLimitItemList(@Param("start")Integer start,@Param("rows")Integer rows);

}
