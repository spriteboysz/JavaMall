package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.UserAddress;
import com.deean.dnmall.mapper.UserAddressMapper;
import com.deean.dnmall.service.UserAddressService;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Deean
 * @description 针对表【user_address(用户地址)】的数据库操作Service实现
 * @createDate 2023-11-26 11:42:57
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress>
        implements UserAddressService {

    @Resource
    private UserAddressMapper userAddressMapper;

    @Override
    public ResultVO listAddrsByUserId(int userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_id", userId);
        QueryWrapper<UserAddress> queryWrapper = new QueryWrapper<>();
        queryWrapper.allEq(map);
        List<UserAddress> userAddresses = userAddressMapper.selectList(queryWrapper);
        return new ResultVO(ResStatus.success, "success", userAddresses);
    }
}




