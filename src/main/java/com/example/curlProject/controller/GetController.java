package com.example.curlProject.controller;

import com.example.curlProject.data.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/get-api")
public class GetController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(value = "/var1/{var}")
    public String getVar1(@PathVariable String var){
        return var + "";
    }

    @GetMapping(value = "/var2/{var2}")
    public String getVar2(@PathVariable("var2") String var){
        return var;
    }

    @GetMapping(value = "/request1")
    public String getRequestParam1(@RequestParam String name, @RequestParam String email, @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + ":" + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
