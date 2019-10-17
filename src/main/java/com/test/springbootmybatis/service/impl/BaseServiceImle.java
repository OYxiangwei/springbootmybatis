package com.test.springbootmybatis.service.impl;

import com.test.springbootmybatis.dao.BaseMapper;
import com.test.springbootmybatis.entity.User;
import com.test.springbootmybatis.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(rollbackFor = Exception.class)
public abstract class BaseServiceImle<T> implements IBaseService<T> {
    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public Integer save(T t) {
        return baseMapper.save(t);
    }

    @Override
    public void delete(Integer id) {
        baseMapper.delete(id);
    }

    @Override
    public void update(T t) {
        baseMapper.update(t);
    }

    @Override
    public T findById(Integer id) {
        return baseMapper.findById(id);
    }

    @Override
    public List list() {
        return baseMapper.list();
    }
}
