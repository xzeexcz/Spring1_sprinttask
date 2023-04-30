package com.kz.bitlab.SpringBoot.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;
}
