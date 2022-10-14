package org.zerock.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Controller
@RequestMapping("/sample/*")
@Log4j2
public class SampleController {

    // 6-2
    @RequestMapping(value="/basic", method = { RequestMethod.GET })
    public void basicGet() {
        System.out.println("basic Get.....");
    }

    // 6-3
    // public String ex02(SampleDTO dto) {
    // 6-3-1
    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        return "ex02";

    }
    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("ids") String[] ids) {
        System.out.println("ids: " + ids);
        return "ex02List";

    }
    @GetMapping("/ex02Array")
    public String ex02Array(@RequestParam("ids") String[] ids) {
        System.out.println("ids: " + ids);
        return "ex02Array";

    }
    // 6-3-3
    @GetMapping("/ex02Bean")
    public String ex02Bean(SampleDTOList list) {

        System.out.println("list dtos: " + list);
        return "ex02Bean";

    }

    // 6-3-4
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
    }
    @GetMapping("/ex03")
    public String ex03(TodoDTO todo) {

        System.out.println("todo: " + todo);
        return "ex03";

    }

    // 6-4-1
    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
        // http://localhost:8081/sample/ex04?name=aaaa&age=11&page=9
        return "/sample/ex04";

    }

    @GetMapping("/ex06")
    public @ResponseBody SampleDTO ex06() {
        log.info("/ex06............");
        SampleDTO dto = new SampleDTO();
        dto.setAge(10);
        dto.setName("홍길동");
        return dto;
    }

    @RequestMapping("/ex08")
    @ResponseBody
    public String ex08() {
        return "테스트";
    }
    @GetMapping("/ex07")
    public ResponseEntity<String> ex07() {
        log.info("/ex07.........");
        String msg = "{\"name\": \"이상철\"}";
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json;charset=UTF-8");
        return new ResponseEntity<>(msg, header, HttpStatus.OK);
    }

    @GetMapping("/exUpload")
    public void exUpload() {
        log.info("/exUpload..........");
    }

    @GetMapping("/exUploadPost")
    public void exUploadPost(ArrayList<MultipartFile> files) {
        files.forEach(file -> {
            log.info("---------------------------");
            log.info("name: " + file.getOriginalFilename());
            log.info("size: " + file.getSize());
        });
    }
}
