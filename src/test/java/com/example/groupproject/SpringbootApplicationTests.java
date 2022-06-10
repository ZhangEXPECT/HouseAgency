package com.example.groupproject;

import com.example.groupproject.config.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 */
@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    private Hello hello;


    @Test
    void contextLoads() {
        this.hello.say();

    }

}
