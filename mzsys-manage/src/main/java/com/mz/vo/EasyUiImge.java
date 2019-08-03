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
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class EasyUiImge {

    private Integer error = 0; //0成功 1失败
    private String url; //文件的网络虚拟地址
    private Integer width;
    private Integer height;

}
