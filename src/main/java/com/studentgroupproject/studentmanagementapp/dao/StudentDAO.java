package com.studentgroupproject.studentmanagementapp.dao;

import com.studentgroupproject.studentmanagementapp.model.Courses;
import com.studentgroupproject.studentmanagementapp.model.Students;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    List<Students> findAll();

    Page<Students> findAll(Pageable pageable);

    Optional<Students> findById(Long id);

     Students save(Students student);

    void deleteById(Long id);

    Page<Students> findByActiveTrue(Pageable pageable);
}
