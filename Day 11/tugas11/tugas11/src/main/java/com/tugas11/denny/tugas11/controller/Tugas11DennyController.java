package com.tugas11.denny.tugas11.controller;

import com.tugas11.denny.tugas11.response.StudentResponse;
import com.tugas11.denny.tugas11.request.StudentRequest;
import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Tugas11DennyController {

    @GetMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getUser(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();
        ArrayList<StudentResponse> dataStudent = new ArrayList<StudentResponse>();

        dataStudent.add(new StudentResponse("1", "Denta", "Jalan Raya Kemang"));
        dataStudent.add(new StudentResponse("2", "Denny", "Jalan Raya Ciganjur"));
        dataStudent.add(new StudentResponse("3", "Dimas", "Jalan Raya Jagakarsa"));

        res.put("code", "200");
        res.put("message", "success");
        res.put("data",dataStudent);

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @PostMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> addUser(@RequestBody StudentRequest studentRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        StudentRequest student = new StudentRequest();

        student.setIdUser("1");
        student.setAddressUser(studentRequest.getAddressUser());
        student.setNamaUser(studentRequest.getNamaUser());

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", student);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @PutMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> editUser(@RequestBody StudentRequest studentRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        StudentRequest student = new StudentRequest();

        student.setIdUser("1");
        student.setAddressUser(studentRequest.getAddressUser());
        student.setNamaUser(studentRequest.getNamaUser());

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", student);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @DeleteMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> deleteUser(String userId){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", "Hello world deleted");

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

}