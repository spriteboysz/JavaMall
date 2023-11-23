package com.deean.tkmapperdemo.mapper;

import com.deean.tkmapperdemo.bean.User;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void insertUserTest01() {
        User user = new User(0, "Deean", "123456", "Deean", "M", "13888888888", "M");
        int i = userMapper.insert(user);
        System.out.println(i);
    }

    @Test
    public void insertUserTest02() {
        User user = new User(0, "Deean02", "123456", "Deean", "M", "13888888888", "M");
        int i = userMapper.insertUseGeneratedKeys(user);
        System.out.println(i);
        System.out.println(user);
    }

    @Test
    public void deleteUserTest01() {
        int i = userMapper.deleteByPrimaryKey(2);
        System.out.println(i);
    }

    @Test
    public void updateUserTest01() {
        User user = new User(3, "Deean02", "123456", "Deean", "M", "13888888888", "M");
        int i = userMapper.updateByPrimaryKey(user);
        System.out.println(i);
    }

    @Test
    public void queryUserTest01() {
        System.out.println(userMapper);
        assertNotNull(userMapper);
        List<User> users = userMapper.selectAll();
        users.forEach(System.out::println);
    }

    @Test
    public void queryUserTest02() {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userGender", "M");
        criteria.andEqualTo("userDesc", "M");
        List<User> users = userMapper.selectByExample(example);
        users.forEach(System.out::println);
    }

    @Test
    public void queryUserTest03() {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("userName", "%een%");
        List<User> users = userMapper.selectByExample(example);
        users.forEach(System.out::println);
    }

    @Test
    public void queryUserTest04() {
        int pageNum = 2, pageSize = 2;
        int start = (pageNum - 1) * pageSize;
        RowBounds rowBounds = new RowBounds(start, pageSize);
        List<User> users = userMapper.selectByRowBounds(new User(), rowBounds);
        users.forEach(System.out::println);

        int i = userMapper.selectCount(new User());
        System.out.println(i);
    }
}