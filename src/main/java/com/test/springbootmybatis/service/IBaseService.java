package com.test.springbootmybatis.service;

import java.util.List;

public interface IBaseService<T> {
    Integer save(T t);
    void delete(Integer id);
    void update(T t);
    T findById(Integer id);
    List<T> list();
}
