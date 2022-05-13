package com.jackyzeng.structure.db.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jackyzeng.structure.db.model.BaseModel;
import com.jackyzeng.structure.db.model.PageQuery;

public interface IBaseService<T extends BaseModel, Q extends PageQuery> extends IService<T> {
    Page<T> page(Q query);
}
