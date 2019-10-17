package com.test.springbootmybatis.dao;

import org.springframework.stereotype.Service;

import java.util.List;


public interface BaseMapper<T> {
    Integer save(T t);
    void delete(Integer id);
    T findById(Integer id);
    void update(T t);
    List<T> list();
}
