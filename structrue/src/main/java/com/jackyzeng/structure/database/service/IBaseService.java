package com.jackyzeng.structure.database.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jackyzeng.structure.database.entity.BaseEntity;
import com.jackyzeng.structure.database.entity.BaseQuery;

public interface IBaseService<T extends BaseEntity, Q extends BaseQuery> extends IService<T> {
    Page<T> page(Q query);
}
