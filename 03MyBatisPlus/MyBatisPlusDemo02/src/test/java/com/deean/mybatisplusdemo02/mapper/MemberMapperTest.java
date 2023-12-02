package com.deean.mybatisplusdemo02.mapper;

import com.deean.mybatisplusdemo02.bean.Member;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class MemberMapperTest {

    @Resource
    private MemberMapper memberMapper;

    @Test
    public void queryTest01() {
        List<Member> members = memberMapper.selectList(null);
        for (Member member : members) {
            System.out.println(member);
        }
    }
}