package com.tugas11.denny.tugas11.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private String idUser;
    private String namaUser;
    private String addressUser;
}