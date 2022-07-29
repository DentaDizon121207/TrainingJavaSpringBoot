package com.tugas11.denny.tugas11.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    private String idUser;
    private String namaUser;
    private String addressUser;
}