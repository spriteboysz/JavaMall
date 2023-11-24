package com.deean.dnmall.vo;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Deean
 * Date: 2023-11-20 23:20
 * FileName: common/src/main/java/com/deean/dnmall/vo
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Tag(name="ResultVO")
public class ResultVO {
    private int code;
    private String msg;
    private Object data;
}
