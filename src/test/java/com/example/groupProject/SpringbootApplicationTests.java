package com.example.groupProject;

import com.example.groupProject.config.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
