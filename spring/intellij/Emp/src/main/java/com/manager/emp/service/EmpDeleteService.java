package com.manager.emp.service;

import com.manager.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpDeleteService {

    @Autowired(required = false)
    private EmpMapper empMapper;

    public int deleteE(int empno){

        return empMapper.deleteEmp(empno);
    }

}
