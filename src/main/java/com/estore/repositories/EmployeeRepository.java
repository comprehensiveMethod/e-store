package com.estore.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estore.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.lastName = ?1 and e.firstName = ?2 and e.patronymic = ?3 and e.birthDate = ?4")
    public Employee findFullName(String lastName, String firstName, String patronymic, Date birthDate);

    @Query("select e from Employee e where e.positionId = ?1")
    public List<Employee> findByPosition(Long positionId);

}

