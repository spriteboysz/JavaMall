package com.deean.dnmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 购物车
 *
 * @TableName shopping_cart
 */
@Data
public class ShoppingCartVO implements Serializable {
    /**
     * 主键
     */
    private Integer cartId;

    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * skuID
     */
    private Integer skuId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 购物车商品数量
     */
    private String cartNum;

    /**
     * 添加购物车时间
     */
    private String cartTime;

    /**
     * 添加购物车时商品价格
     */
    private BigDecimal cartPrice;

    /**
     * 选择的套餐的属性
     */
    private String skuProps;

    private String productName;

    private String productImage;

    private double skuOriginalPrice;
    private double skuSellPrice;
    private String skuName;
    private int skuStock;
}