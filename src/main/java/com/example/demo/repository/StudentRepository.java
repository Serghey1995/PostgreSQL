package com.example.demo.repository;



import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByName(String name);
    List<Student> findAllBySurname(String surname);
    List<Student> findAllByNameAndSurname(String name,String surname);
    List<Student> findAllByAddress_Country(String country);
    List<Student> findAllByAddress_City(String city);
    List<Student> findAllByAddress_Street(String street);
    List<Student> findAllByGroup_GroupName(String groupName);
    List<Student> findAllByAddress_CountryAndAddress_City(String country,String city);
    
}
