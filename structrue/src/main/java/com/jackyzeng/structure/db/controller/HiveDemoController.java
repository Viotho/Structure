package com.jackyzeng.structure.db.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.jackyzeng.structure.common.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/hive")
@DS("hive")
public class HiveDemoController {

    @Autowired
//    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @DS("hive")
    @GetMapping("/select")
    public Result<List<Map<String, Object>>> select() {
        return Result.succeed(jdbcTemplate.queryForList("SELECT * From ..."));
    }
}
