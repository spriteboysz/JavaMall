package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品;商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * @TableName product
 */
@TableName(value ="product")
@Data
public class Product implements Serializable {
    /**
     * 商品主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer productId;

    /**
     * 商品名称;商品名称
     */
    private String productName;

    /**
     * 分类外键id;分类id
     */
    private Integer categoryId;

    /**
     * 一级分类外键id;一级分类id，用于优化查询
     */
    private Integer productCategoryId;

    /**
     * 销量;累计销售
     */
    private Integer productSoldNum;

    /**
     * 默认是1，表示正常状态, -1表示删除, 0下架;默认是1，表示正常状态, -1表示删除, 0下架
     */
    private Integer productStatus;

    /**
     * 商品内容;商品内容
     */
    private String productContent;

    /**
     * 创建时间
     */
    private Date productCreateTime;

    /**
     * 更新时间
     */
    private Date productUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}