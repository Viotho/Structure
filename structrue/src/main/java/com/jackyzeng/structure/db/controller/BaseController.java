package com.jackyzeng.structure.db.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jackyzeng.structure.common.model.Result;
import com.jackyzeng.structure.db.entity.BaseEntity;
import com.jackyzeng.structure.db.entity.BaseForm;
import com.jackyzeng.structure.db.entity.BaseQuery;
import com.jackyzeng.structure.db.service.IBaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T extends BaseEntity, F extends BaseForm, Q extends BaseQuery> {

    protected abstract IBaseService<T, Q> getService();

    protected abstract Class<T> getEntityClass();

    @GetMapping("/list")
    public Result<List<T>> list() {
        return Result.succeed(getService().list());
    }

    @PostMapping("/create")
    public Result<Boolean> create(@RequestBody F form) {
        T entity = formConvert(form);
        return Result.succeed(getService().save(entity));
    }

    @PutMapping("/update/{id}")
    public Result<Boolean> update(@PathVariable("id") Long id, @RequestBody F form) {
        T entity = formConvert(form);
        entity.setId(id);
        return Result.succeed(getService().updateById(entity));
    }

    @DeleteMapping("/delete/{id}")
    public Result<Boolean> delete(@PathVariable("id") Long id) {
        return Result.succeed(getService().removeById(id));
    }

    @DeleteMapping("/batchDelete")
    public Result<Boolean> batchDelete(@RequestBody List<Long> ids) {
        return Result.succeed(getService().removeByIds(ids));
    }

    @PostMapping("/page")
    public Result<Page<T>> page(@RequestBody Q query) {
        return Result.succeed(getService().page(query));
    }

    protected T formConvert(F form) {
        try {
            T entity = getEntityClass().newInstance();
            BeanUtils.copyProperties(form, entity);
            return entity;
        } catch (InstantiationException | IllegalAccessException exception) {
            throw new RuntimeException(exception);
        }
    }
}
