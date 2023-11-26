package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.UserAddress;
import com.deean.dnmall.service.UserAddressService;
import com.deean.dnmall.mapper.UserAddressMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【user_address(用户地址)】的数据库操作Service实现
* @createDate 2023-11-26 11:42:57
*/
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress>
    implements UserAddressService{

}




