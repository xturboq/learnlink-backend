package com.zecola.learnlink.service;

import com.zecola.learnlink.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class LearnLinkTest {
    @Resource
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSearchUserByTags() {
        List<String> tagNameList = Arrays.asList("java", "python");
        List<User> userList = userService.searchUsersByTags(tagNameList);
        Assert.assertNotNull(userList);
    }
    @Test
    void stringTest(){
        redisTemplate.opsForValue().set("username","David");
        String username = (String) redisTemplate.opsForValue().get("username");
        System.out.println(username);
    }

}
