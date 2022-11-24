package com.manager.emp.mapper;

import com.manager.emp.domain.EmpDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    // 전체 부서 리스트
    List<EmpDTO> list();

    // 등록
    int insertEmp(EmpDTO empDTO);

    // 픽
    EmpDTO selectByEmpno(int empno);

    // 수정
    int editEmp(EmpDTO empDTO);

    // 삭제
    int deleteEmp(int empno);





}
