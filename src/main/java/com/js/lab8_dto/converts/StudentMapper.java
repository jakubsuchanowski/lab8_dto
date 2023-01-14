package com.js.lab8_dto.converts;

import com.js.lab8_dto.domain.Student;
import com.js.lab8_dto.dtos.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    @Mapping(target = "street", source = "student.address.street")
    @Mapping(target = "city", source = "student.address.city")
    @Mapping(target = "state", source = "student.address.state")
    @Mapping(target = "zip", source = "student.address.zip")
    StudentDTO mapStudentToStudentDTO(Student student);

}
