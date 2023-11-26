package com.deean.dnmall.vo;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "封装接口返回给前端的数据")
public class ResultVO {
    @Schema(description = "响应状态码", type = "int")
    private int code;
    @Schema(description = "响应提示信息")
    private String msg;
    @Schema(description = "响应数据")
    private Object data;
}
