package com.deean;

import com.deean.dnmall.service.UserAddressService;
import com.deean.dnmall.vo.ResultVO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Author: Deean
 * Date: 2024-01-02 22:45
 * FileName: api/src/test/java/com/deean
 * Description:
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UserAddressServiceTest {

    @Resource
    private UserAddressService userAddressService;

    @Test
    public void userAddressServiceTest() {
        ResultVO resultVO = userAddressService.listAddrsByUserId(1);
        System.out.println(resultVO);
    }
}
