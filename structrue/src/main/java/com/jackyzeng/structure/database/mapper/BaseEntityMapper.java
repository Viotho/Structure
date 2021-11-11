package com.jackyzeng.structure.database.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jackyzeng.structure.database.entity.BaseEntity;

public interface BaseEntityMapper<T extends BaseEntity> extends BaseMapper<T> {

}
