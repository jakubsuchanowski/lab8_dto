package com.js.lab8_dto.repositories;

import com.js.lab8_dto.domain.Student;
import com.js.lab8_dto.dtos.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select new com.js.lab8_dto.dtos.StudentDTO(s.name, s.surname, s.age, "+
            "s.address.street, s.address.city,s.address.zip, s.address.state) from Student s")
    List<StudentDTO> findAllNoAttachment();
}
