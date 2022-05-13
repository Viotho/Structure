package com.jackyzeng.structure.db.mapper;

import com.jackyzeng.structure.db.model.BaseDto;
import com.jackyzeng.structure.db.model.BaseModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DemoMapper {

    List<BaseModel> findList(@Param("condition") BaseDto condition);

    int insertBatch(@Param("list") List<BaseModel> entities);

    int deleteBatch(@Param("ids") List<Long> ids);
}
