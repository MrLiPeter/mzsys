package com.mz.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/8/3
 */
@Data
@Accessors(chain = true)
@TableName("tb_item_desc")
public class ItemDesc extends BasePojo{
    @TableId
    private Long itemId;
    private String itemDesc;

}
