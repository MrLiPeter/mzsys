package com.mz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/8/1
 */
@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName("tb_item_cat")
public class ItemCat extends BasePojo{
   @TableId(type = IdType.AUTO)
   private Long id;
   private Long parentId;
   private String name;
   private Integer status; //1(正常)|2（删除）
   private Integer sortOrder; //排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
   private Boolean  isParent; //该类目是否为父类目，1为true，0为false注意要用驼峰命名不然数据库中取出空值，一脸懵逼
}
