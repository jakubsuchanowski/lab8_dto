package com.js.lab8_dto.controllers;

import com.js.lab8_dto.domain.Student;
import com.js.lab8_dto.dtos.StudentDTO;
import com.js.lab8_dto.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDTO> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/noAttachment")
    public List<StudentDTO> getAllStudentsNoAttachment(){
        return studentService.getAllStudentsNoAttachment();
    }
}
