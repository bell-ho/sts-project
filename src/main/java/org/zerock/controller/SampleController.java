package org.zerock.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zerock.domain.SampleDTO;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        log.info("" + dto);
        return "ex01";
    }

    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
        log.info("name: " + name);
        log.info("age: " + age);
        return "ex02";
    }

    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
        log.info("dto" + dto);
        log.info("page" + page);
        return "/sample/ex04";
    }

    @GetMapping("/ex06")
    @ResponseBody
    public SampleDTO ex06() {
        SampleDTO dto = new SampleDTO();
        dto.setAge(10);
        dto.setName("홍길");
        return dto;
    }
}
