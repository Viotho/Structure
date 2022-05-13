package com.jackyzeng.structure.db.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//@Configuration
public class HiveConfig {

    @Autowired
    private Environment environment;

    @Bean("hiveJdbcDataSource")
    @Qualifier("hiveJdbcDataSource")
    public DruidDataSource hiveJdbcDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(environment.getProperty("hive.url"));
        dataSource.setDriverClassName(environment.getProperty("hive.driver-class-name"));
        dataSource.setUsername(environment.getProperty("hive.username"));
        dataSource.setPassword(environment.getProperty("hive.password"));
        return dataSource;
    }

    @Bean("hiveJdbcTemplate")
    @Qualifier("hiveJdbcTemplate")
    public JdbcTemplate hiveJdbcTemplate(@Qualifier("hiveJdbcDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
