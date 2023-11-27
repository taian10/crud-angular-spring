package com.taian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taian.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    
}  
