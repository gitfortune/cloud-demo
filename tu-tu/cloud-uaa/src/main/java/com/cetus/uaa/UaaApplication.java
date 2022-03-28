package com.cetus.uaa;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zh
 * @date : 2022/3/3
 */
@SpringBootApplication
public class UaaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UaaApplication.class).run(args);
    }
}
