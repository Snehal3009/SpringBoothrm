package com.csi.repo;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    //Custom Method

    public List<Employee>findByEmpName(String empName );
    public Employee findByEmpContactNumber(long empContactNumber);

}
