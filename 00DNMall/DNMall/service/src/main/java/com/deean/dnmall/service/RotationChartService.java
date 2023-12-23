package com.deean.dnmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.deean.dnmall.bean.RotationChart;
import com.deean.dnmall.vo.ResultVO;

/**
* @author Deean
* @description 针对表【rotation_chart(轮播图)】的数据库操作Service
* @createDate 2023-12-14 23:55:56
*/
public interface RotationChartService extends IService<RotationChart> {
    ResultVO listRotationChart();
}
