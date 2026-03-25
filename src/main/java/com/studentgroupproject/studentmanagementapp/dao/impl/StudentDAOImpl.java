package com.studentgroupproject.studentmanagementapp.dao.impl;

import com.studentgroupproject.studentmanagementapp.dao.StudentDAO;
import com.studentgroupproject.studentmanagementapp.model.Students;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

import com.studentgroupproject.studentmanagementapp.repository.StudentRepository ;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private final StudentRepository studentRepository;

    public StudentDAOImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Page<Students> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Optional<Students> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Students save(Students student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Page<Students> findByActiveTrue(Pageable pageable) {
        return studentRepository.findByActiveTrue(pageable);
    }
}
