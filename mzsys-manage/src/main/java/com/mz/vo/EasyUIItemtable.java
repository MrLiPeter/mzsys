package com.mz.vo;

import com.mz.pojo.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class EasyUIItemtable {

    private Integer total;
    private List<Item> rows;

}
