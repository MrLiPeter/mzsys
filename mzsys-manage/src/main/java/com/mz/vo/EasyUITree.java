package com.mz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/8/3
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class EasyUITree {

    private Long id;
    private String text;
    private String state;

}
