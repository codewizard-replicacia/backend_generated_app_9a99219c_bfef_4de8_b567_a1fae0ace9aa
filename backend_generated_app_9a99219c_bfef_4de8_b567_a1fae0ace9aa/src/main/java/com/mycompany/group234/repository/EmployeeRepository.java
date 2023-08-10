package com.mycompany.group234.repository;


import com.mycompany.group234.model.Employee;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class EmployeeRepository extends SimpleJpaRepository<Employee, String> {
    private final EntityManager em;
    public EmployeeRepository(EntityManager em) {
        super(Employee.class, em);
        this.em = em;
    }
    @Override
    public List<Employee> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Employee\"", Employee.class).getResultList();
    }
}