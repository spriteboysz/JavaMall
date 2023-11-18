package com.deean.springbootssm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-18 23:47
 * FileName: src/main/java/com/deean/springbootssm/bean
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int bId;
    private String bookNum;
    private String bookName;
    private String bookAuthor;
    private double bookPrice;
    private String bookDesc;
    private int bookStock;
}
