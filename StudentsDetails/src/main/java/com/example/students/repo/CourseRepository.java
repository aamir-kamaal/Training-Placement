package com.example.students.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.students.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
