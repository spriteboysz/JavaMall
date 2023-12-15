package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.RotationChart;
import com.deean.dnmall.mapper.RotationChartMapper;
import com.deean.dnmall.service.RotationChartService;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author Deean
 * @description 针对表【rotation_chart(轮播图)】的数据库操作Service实现
 * @createDate 2023-12-14 23:55:56
 */
@Service
public class RotationChartServiceImpl extends ServiceImpl<RotationChartMapper, RotationChart>
        implements RotationChartService {

    public ResultVO listRotationChart() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("chart_status", "1");
        List<RotationChart> rotationCharts = listByMap(map);
        if (rotationCharts.isEmpty()) {
            return new ResultVO(ResStatus.fail, "fail", null);
        } else {
            for (RotationChart rotationChart : rotationCharts) {
                System.out.println(rotationChart);
            }
            return new ResultVO(ResStatus.success, "success", rotationCharts);
        }
    }
}




