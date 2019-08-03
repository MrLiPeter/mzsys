package com.mz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 全局返回结果
 * Author : LiZuPei
 * Created by sheting on 2019/8/3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysResult {

    private Integer status = 200; //状态码200 成功
    private String msg = "成功";
    private Object data;

    public static SysResult success(){
        return  new SysResult(200,"成功",null);
    }

    public static SysResult success(Object data){
        return new SysResult(200,"成功",data);
    }

    public static SysResult fail(){
        return new SysResult(201,"失败",null);
    }

}
