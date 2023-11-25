package com.deean.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.mybatisplusdemo.bean.Member;
import com.deean.mybatisplusdemo.service.MemberService;
import com.deean.mybatisplusdemo.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【members】的数据库操作Service实现
* @createDate 2023-11-25 23:11:52
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService {

}




