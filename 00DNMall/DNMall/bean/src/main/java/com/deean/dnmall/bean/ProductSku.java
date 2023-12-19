package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品规格;每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * @TableName product_sku
 */
@TableName(value ="product_sku")
@Data
public class ProductSku implements Serializable {
    /**
     * sku编号
     */
    @TableId(type = IdType.AUTO)
    private Integer skuId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * sku图片
     */
    private String skuImage;

    /**
     * 属性组合（格式是p1:v1;p2:v2）
     */
    private String skuUntitled;

    /**
     * 原价
     */
    private Integer skuOriginalPrice;

    /**
     * 销售价格
     */
    private Integer skuSellPrice;

    /**
     * 折扣力度
     */
    private BigDecimal skuDiscounts;

    /**
     * 库存
     */
    private Integer skuStock;

    /**
     * 创建时间
     */
    private Date skuCreateTime;

    /**
     * 更新时间
     */
    private Date skuUpdateTime;

    /**
     * sku状态(1启用，0禁用，-1删除)
     */
    private Integer skuStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}