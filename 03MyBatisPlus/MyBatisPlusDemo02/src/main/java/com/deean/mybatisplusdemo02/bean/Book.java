package com.deean.mybatisplusdemo02.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName books
 */
@TableName(value = "books")
@Data
public class Book implements Serializable {
    @TableId
    private String bookId;

    private String bookName;

    private String bookAuthor;

    private String bookCover;

    private Double bookPrice;

    private String bookDesc;

    private Integer bookStock;

    private Integer bookType;

    @Serial
    private static final long serialVersionUID = 1L;
}