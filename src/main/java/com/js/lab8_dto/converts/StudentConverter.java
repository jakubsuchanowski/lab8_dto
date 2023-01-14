package com.js.lab8_dto.converts;

import com.js.lab8_dto.domain.Student;
import com.js.lab8_dto.dtos.StudentDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter implements Converter<Student, StudentDTO> {
    @Override
    public StudentDTO convert(Student source){
        return StudentDTO.builder().name(source.getName())
                .surname(source.getSurname())
                .age(source.getAge())
                .street(source.getAddress().getStreet())
                .city(source.getAddress().getCity())
                .zip(source.getAddress().getZip())
                .state(source.getAddress().getState())
                .build();
    }
}
