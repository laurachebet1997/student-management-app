package com.studentgroupproject.studentmanagementapp.dao.impl;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.studentgroupproject.studentmanagementapp.Controller.CourseController;
import com.studentgroupproject.studentmanagementapp.dto.CourseDTO;
import com.studentgroupproject.studentmanagementapp.model.Courses;
import com.studentgroupproject.studentmanagementapp.repository.CourseRepository;
import com.studentgroupproject.studentmanagementapp.service.CourseService;

import com.studentgroupproject.studentmanagementapp.dao.CourseDAO;

@Repository
public class CourseDAOImpl implements CourseDAO {

    private final CourseRepository courseRepository;

    public CourseDAOImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Courses> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Page<Courses> findAll(Pageable pageable) {
        return courseRepository.findAll(pageable);
    }

    @Override
    public Courses save(Courses course) {
        return courseRepository.save(course);
    }

    @Override
    public Optional<Courses> findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Page<Courses> findByActiveTrue(Pageable pageable) {
        return courseRepository.findByActiveTrue(pageable);
    }
}
