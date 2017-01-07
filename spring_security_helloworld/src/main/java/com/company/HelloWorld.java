package com.company;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Administrator on 2017/1/7.
 */
@SpringBootApplication
public class HelloWorld {

        public static void main(String[] args) {
            new SpringApplicationBuilder(HelloWorld.class).web(true).run(args);
        }
}
