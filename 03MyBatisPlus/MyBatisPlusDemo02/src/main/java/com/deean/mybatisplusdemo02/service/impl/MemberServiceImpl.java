package com.deean.mybatisplusdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.mybatisplusdemo02.bean.Member;
import com.deean.mybatisplusdemo02.service.MemberService;
import com.deean.mybatisplusdemo02.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【members】的数据库操作Service实现
* @createDate 2023-12-02 23:08:19
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}




