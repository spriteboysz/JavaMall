package com.deean.tkmapperdemo.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 表名：books
*/
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    @Id
    @Column(name = "book_id")
    private String bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_cover")
    private String bookCover;

    @Column(name = "book_price")
    private Double bookPrice;

    @Column(name = "book_desc")
    private String bookDesc;

    @Column(name = "book_stock")
    private Integer bookStock;

    @Column(name = "book_type")
    private Integer bookType;

    /**
     * @return bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return bookAuthor
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * @param bookAuthor
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * @return bookCover
     */
    public String getBookCover() {
        return bookCover;
    }

    /**
     * @param bookCover
     */
    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    /**
     * @return bookPrice
     */
    public Double getBookPrice() {
        return bookPrice;
    }

    /**
     * @param bookPrice
     */
    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    /**
     * @return bookDesc
     */
    public String getBookDesc() {
        return bookDesc;
    }

    /**
     * @param bookDesc
     */
    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    /**
     * @return bookStock
     */
    public Integer getBookStock() {
        return bookStock;
    }

    /**
     * @param bookStock
     */
    public void setBookStock(Integer bookStock) {
        this.bookStock = bookStock;
    }

    /**
     * @return bookType
     */
    public Integer getBookType() {
        return bookType;
    }

    /**
     * @param bookType
     */
    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }
}