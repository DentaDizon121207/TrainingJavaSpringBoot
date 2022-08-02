package com.Day15Denny.Tugas15Denny.controller;

import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Tugas15DennyController {
    @GetMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getUsers() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Map<String, Object> res = new HashMap<String, Object>();

        List<String> data = new ArrayList<String>();
        data.add("budi");
        data.add("ardi");
        data.add("fuad");
        data.add("tasya");
        data.add("erna");

        res.put("code", HttpStatus.OK.value());
        res.put("message", "success");
        res.put("data", data);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }
}