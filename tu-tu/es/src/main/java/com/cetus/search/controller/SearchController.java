package com.cetus.search.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zh
 * @date : 2022/3/3
 */
@RestController
public class SearchController {

    @GetMapping("/")
    public String search(){

        return "第一页特";
    }


}
