package com.manager.emp.service;

import com.manager.emp.domain.EmpDTO;
import com.manager.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpListService {

    @Autowired(required = false)
    private EmpMapper empMapper;

    public List<EmpDTO> getList(){

        return empMapper.list();
    }
}
