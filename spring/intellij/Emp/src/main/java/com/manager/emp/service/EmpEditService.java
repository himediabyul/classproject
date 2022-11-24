package com.manager.emp.service;

import com.manager.emp.domain.EmpDTO;
import com.manager.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpEditService {

    @Autowired(required = false)
    private EmpMapper empMapper;

    public int editE(EmpDTO empDTO){

       return empMapper.editEmp(empDTO);

    }

}
