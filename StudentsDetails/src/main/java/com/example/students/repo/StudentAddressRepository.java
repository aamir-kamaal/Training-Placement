package com.example.students.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.students.entities.StudentAddress;

public interface StudentAddressRepository extends CrudRepository<StudentAddress, Integer> {

}
