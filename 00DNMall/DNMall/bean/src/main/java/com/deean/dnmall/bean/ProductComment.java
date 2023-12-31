package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价
 * @TableName product_comment
 */
@TableName(value ="product_comment")
@Data
public class ProductComment implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer commentId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 订单项(商品快照)ID;可为空
     */
    private Integer snapshotId;

    /**
     * 评论用户id;用户名须脱敏
     */
    private Integer userId;

    /**
     * 是否匿名（1:是，0:否）
     */
    private Integer commentAnonymous;

    /**
     * 评价类型（1好评，0中评，-1差评）
     */
    private Integer commentType;

    /**
     * 评价等级;1：好评 2：中评 3：差评
     */
    private Integer commentLevel;

    /**
     * 评价内容
     */
    private String commentContent;

    /**
     * 评价晒图(JSON {img1:url1,img2:url2})
     */
    private String commentImage;

    /**
     * 评价时间;可为空
     */
    private Date commentTime;

    /**
     * 是否回复（0:未回复，1:已回复）
     */
    private Integer commentReplyStatus;

    /**
     * 回复内容
     */
    private String commentReplyContent;

    /**
     * 回复时间
     */
    private Date commentReplyTime;

    /**
     * 是否显示（1:是，0:否）
     */
    private Integer commentShow;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}