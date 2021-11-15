package com.jackyzeng.structure.db.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jackyzeng.structure.db.entity.BaseEntity;
import com.jackyzeng.structure.db.entity.BaseQuery;

public interface IBaseService<T extends BaseEntity, Q extends BaseQuery> extends IService<T> {
    Page<T> page(Q query);
}