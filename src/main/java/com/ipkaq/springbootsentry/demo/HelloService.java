package com.ipkaq.springbootsentry.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author ipkaq
 */
@Slf4j
@Service
public class HelloService {
    public String hello() throws InterruptedException {
        Integer i = new Random().nextInt(20);
        log.warn("hello world service被调用");
        if (i > 10) {
            throw new ComputeExcetption("计算失败");
        }
        return "hello";

    }
}
