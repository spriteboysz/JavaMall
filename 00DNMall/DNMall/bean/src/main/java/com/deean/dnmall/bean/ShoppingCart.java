package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 购物车
 * @TableName shopping_cart
 */
@TableName(value ="shopping_cart")
@Data
public class ShoppingCart implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}