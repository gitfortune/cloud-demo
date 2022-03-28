package com.cetus.search;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zh
 * @date : 2022/3/3
 */
@SpringBootApplication
public class EearchApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EearchApplication.class).run(args);
    }
}
