package com.js.lab8_dto.services;

import com.js.lab8_dto.converts.StudentConverter;
import com.js.lab8_dto.converts.StudentMapper;
import com.js.lab8_dto.domain.Student;
import com.js.lab8_dto.dtos.StudentDTO;
import com.js.lab8_dto.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;
    private final StudentMapper studentMapper;

    public List<StudentDTO> getAllStudents(){
//        return (List<StudentDTO>) studentRepository.findAll().stream()
//                .map(studentConverter::convert)
//                .collect(Collectors.toList());
        return studentRepository.findAll().stream()
                .map(studentMapper::mapStudentToStudentDTO)
                .collect(Collectors.toList());
    }

    public List<StudentDTO> getAllStudentsNoAttachment(){
        return studentRepository.findAllNoAttachment();
    }
}
