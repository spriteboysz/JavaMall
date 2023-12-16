package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 商品分类
 * @TableName category
 */
@TableName(value ="category")
@Data
public class Category implements Serializable {
    /**
     * 主键;分类id主键
     */
    @TableId(type = IdType.AUTO)
    private Integer categoryId;

    /**
     * 分类名称;分类名称
     */
    private String categoryName;

    /**
     * 分类层级;分类得类型，1:一级大分类2:二级分类3:三级小分类
     */
    private Integer categoryLevel;

    /**
     * 父层级id;父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    private Integer categoryParentId;

    /**
     * 图标;logo
     */
    private String categoryIcon;

    /**
     * 口号
     */
    private String categorySlogan;

    /**
     * 分类图
     */
    private String categoryImage;

    /**
     * 背景颜色
     */
    private String categoryColor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}