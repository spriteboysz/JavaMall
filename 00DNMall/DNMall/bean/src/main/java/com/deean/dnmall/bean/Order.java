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
 * 订单
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Order implements Serializable {
    /**
     * 订单ID;同时也是订单编号
     */
    @TableId
    private String orderId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 产品名称（多个产品用,隔开）
     */
    private String orderProducts;

    /**
     * 收货人快照
     */
    private String orderReceiverName;

    /**
     * 收货人手机号快照
     */
    private String orderReceiverMobile;

    /**
     * 收货地址快照
     */
    private String orderReceiverAddress;

    /**
     * 订单总价格
     */
    private BigDecimal orderTotalAmount;

    /**
     * 实际支付总价格
     */
    private Integer orderActualAmount;

    /**
     * 支付方式;1:微信 2:支付宝
     */
    private Integer orderPayType;

    /**
     * 订单备注
     */
    private String orderRemark;

    /**
     * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    private String orderStatus;

    /**
     * 配送方式
     */
    private String orderDeliveryType;

    /**
     * 物流单号
     */
    private String orderDeliveryId;

    /**
     * 订单运费;默认可以为零，代表包邮
     */
    private BigDecimal orderFreight;

    /**
     * 逻辑删除状态;1: 删除 0:未删除
     */
    private Integer orderDeleteStatus;

    /**
     * 创建时间（成交时间）
     */
    private Date orderCreateTime;

    /**
     * 更新时间
     */
    private Date orderUpdateTime;

    /**
     * 付款时间
     */
    private Date orderPayTime;

    /**
     * 发货时间
     */
    private Date orderDeliveryTime;

    /**
     * 完成时间
     */
    private Date orderFinishTime;

    /**
     * 取消时间
     */
    private Date orderCancelTime;

    /**
     * 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    private Integer orderCloseType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}