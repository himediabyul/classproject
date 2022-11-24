package com.manager.emp.service;

import com.manager.emp.domain.EmpDTO;
import com.manager.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpReadService {

    @Autowired(required = false)
    public EmpMapper empMapper;

    public EmpDTO readEmp(int empno){

       return empMapper.selectByEmpno(empno);
    }
}
