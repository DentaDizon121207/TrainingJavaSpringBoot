package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.CreateUserDto;
import com.ecommerce.ecommerce.dto.UpdateUserDto;
import com.ecommerce.ecommerce.dto.GetUserDto;
import com.ecommerce.ecommerce.errorresponse.ErrorResponse;
import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional(rollbackOn = Exception.class)

public class UserService {
    @Autowired
    private UserRepository userRepository;

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> create (CreateUserDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        //Map<String, Object> res = new HashMap<String, Object>();

        User user = new User();

        user.setUsername(dto.getUsername().trim());
        user.setPhone(dto.getPhone().trim());
        user.setAddress(dto.getAddress().trim());

        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> update (UpdateUserDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        User user = new User();
        if(Optional.ofNullable(user).isPresent())
        {
            user.setUsername(dto.getUsername().trim());
            user.setPhone(dto.getPhone().trim());
            user.setAddress(dto.getAddress().trim());
            userRepository.save(user);
        }
        else {
            ErrorResponse err = new ErrorResponse("9999","data not found");
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(err);
        }

        res.put("code", 201);
        res.put("message", "success");
        res.put("data", dto);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).build();
    }

    @GetMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getUser(Long id){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();
        User user = new User();
        user.getId();
        userRepository.findById(id);

        res.put("code", "200");
        res.put("message", "success");
        res.put("data",userRepository);

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @DeleteMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> deleteUser(Long id){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", "Hello world deleted");

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

}