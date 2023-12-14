package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 轮播图
 *
 * @TableName rotation_chart
 */
@TableName(value = "rotation_chart")
@Data
public class RotationChart implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer chartId;

    /**
     * 图片;图片地址
     */
    private String chartUrl;

    /**
     * 背景色;背景颜色
     */
    private String chartColor;

    /**
     * 商品id;商品id
     */
    private Integer productId;

    /**
     * 商品分类id;商品分类id
     */
    private Integer categoryId;

    /**
     * 轮播图类型;轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    private Integer chartType;

    /**
     * 轮播图展示顺序;轮播图展示顺序，从小到大
     */
    private Integer chartSeq;

    /**
     * 是否展示:1表示正常显示，0表示下线;是否展示，1：展示    0：不展示
     */
    private Integer chartStatus;

    /**
     * 创建时间;创建时间
     */
    private Date chartCreateTime;

    /**
     * 更新时间;更新
     */
    private Date chartUpdateTime;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}