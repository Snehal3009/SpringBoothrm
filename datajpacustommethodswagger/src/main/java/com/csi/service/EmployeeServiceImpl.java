package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {


    @Autowired
    EmployeeDaoImpl employeeDaoImp;

    public Employee saveData (Employee employee){
        return employeeDaoImp.saveData(employee);
    }
    public Optional<Employee> getDataById(long empId){
        return employeeDaoImp.getDataById(empId);
    }
    public List<Employee> getDataByName(String empName){
        return employeeDaoImp.getDataByName(empName);
    }
    public Employee getDataByContactNumber(long empContactNumber){
        return employeeDaoImp.getDataByContactNumber(empContactNumber);
    }

    public List<Employee>getAllData(){
        return employeeDaoImp.getAllData();
    }
    public Employee updateData(Employee employee){
        return employeeDaoImp.updateData(employee);
    }
    public void deleteDataById(long empId) {
        employeeDaoImp.deleteDataById(empId);
    }


}
