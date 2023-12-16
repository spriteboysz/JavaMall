package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品图片
 * @TableName product_image
 */
@TableName(value ="product_image")
@Data
public class ProductImage implements Serializable {
    /**
     * 图片主键
     */
    @TableId(type = IdType.AUTO)
    private Integer imageId;

    /**
     * 商品外键id;商品外键id
     */
    private Integer productId;

    /**
     * 图片地址;图片地址
     */
    private String imageUrl;

    /**
     * 顺序;图片顺序，从小到大
     */
    private Integer imageSort;

    /**
     * 是否主图;是否主图，1：是，0：否
     */
    private Integer imageMain;

    /**
     * 创建时间
     */
    private Date imageCreatedTime;

    /**
     * 更新时间
     */
    private Date imageUpdatedTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}