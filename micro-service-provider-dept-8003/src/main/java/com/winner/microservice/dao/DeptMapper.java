package com.winner.microservice.dao;

import com.winner.microservice.entities.Dept;

import java.util.List;

/**
 * @author yongs
 */
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
