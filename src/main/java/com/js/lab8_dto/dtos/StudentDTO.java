package com.js.lab8_dto.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private String name;
    private String surname;
    private Integer age;
    private String street;
    private String city;
    private String zip;
    private String state;
}
