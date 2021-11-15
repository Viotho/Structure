package com.jackyzeng.structure.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jackyzeng.structure.db.entity.BaseEntity;

public interface BaseEntityMapper<T extends BaseEntity> extends BaseMapper<T> {

}
