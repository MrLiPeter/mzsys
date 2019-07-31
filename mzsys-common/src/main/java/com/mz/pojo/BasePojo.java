package com.mz.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * pojo的基类完成两个任务
 *  1、封装两个日期
 *  2、实现序列化接口
 * Author : LiZuPei
 * Created by sheting on 2019/7/30
 */
@Data
@Accessors(chain = true)
public class BasePojo implements Serializable {

    private Date created;
    private Date updated;

}
