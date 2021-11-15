package com.jackyzeng.structure.db.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jackyzeng.structure.db.entity.BaseEntity;
import com.jackyzeng.structure.db.entity.BaseQuery;
import com.jackyzeng.structure.db.mapper.BaseEntityMapper;
import com.jackyzeng.structure.db.service.IBaseService;

public abstract class BaseServiceImpl<T extends BaseEntity, Q extends BaseQuery, M extends BaseEntityMapper<T>> extends ServiceImpl<M, T> implements IBaseService<T, Q> {

    @Override
    public Page<T> page(Q query) {
        return null;
    }
}
