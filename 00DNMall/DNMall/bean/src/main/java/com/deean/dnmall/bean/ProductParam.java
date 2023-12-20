package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品参数
 * @TableName product_param
 */
@TableName(value ="product_param")
@Data
public class ProductParam implements Serializable {
    /**
     * 商品参数id
     */
    @TableId(type = IdType.AUTO)
    private Integer paramId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 产地;产地，例：中国江苏
     */
    private String paramPlace;

    /**
     * 保质期;保质期，例：180天
     */
    private String paramPeriod;

    /**
     * 品牌名;品牌名，例：三只大灰狼
     */
    private String paramBrand;

    /**
     * 生产厂名;生产厂名，例：大灰狼工厂
     */
    private String paramFactory;

    /**
     * 生产厂址;生产厂址，例：大灰狼生产基地
     */
    private String paramAddress;

    /**
     * 包装方式;包装方式，例：袋装
     */
    private String paramPackaging;

    /**
     * 规格重量;规格重量，例：35g
     */
    private String paramWeight;

    /**
     * 存储方法;存储方法，例：常温5~25°
     */
    private String paramStorage;

    /**
     * 食用方式;食用方式，例：开袋即食
     */
    private String paramEatingMethod;

    /**
     * 创建时间
     */
    private Date paramCreateTime;

    /**
     * 更新时间
     */
    private Date paramUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}