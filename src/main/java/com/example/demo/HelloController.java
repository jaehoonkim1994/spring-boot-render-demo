package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*") // ⭐ 이 줄 추가
@RestController
public class HelloController {

    @GetMapping("/api/hello")
public Map<String, String> hello(@RequestParam String msg) {
    Map<String, String> result = new HashMap<>();
    result.put("message", msg);
    return result;
}
}
