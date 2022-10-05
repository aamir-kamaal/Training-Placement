package com.example.students.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.students.entities.StudentContact;

public interface StudentContactRepository extends CrudRepository<StudentContact, Integer> {

}
