package com.deean.dnmall.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-21 22:50
 * FileName: common/src/main/java/com/deean/dnmall/util
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageHelper<T> {
    //总记录数
    private long count;

    //总页数
    private int pageCount;

    //分页数据
    private List<T> list;
}
