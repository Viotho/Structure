package com.jackyzeng.structure.database.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jackyzeng.structure.database.entity.BaseEntity;
import com.jackyzeng.structure.database.entity.BaseQuery;
import com.jackyzeng.structure.database.mapper.BaseEntityMapper;
import com.jackyzeng.structure.database.service.IBaseService;

public abstract class BaseServiceImpl<T extends BaseEntity, Q extends BaseQuery, M extends BaseEntityMapper<T>> extends ServiceImpl<M, T> implements IBaseService<T, Q> {

    @Override
    public Page<T> page(Q query) {
        return null;
    }
}
