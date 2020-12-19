package com.niu.springbootredis;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    String key = "key";
    @Test
    public void testSet() {

        redisUtil.set(key, "aaa");
    }
    @Test
    public void testGet(){
        System.out.println(redisUtil.get(key));
    }

}
