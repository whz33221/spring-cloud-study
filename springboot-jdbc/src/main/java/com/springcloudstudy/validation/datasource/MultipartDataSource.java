package com.springcloudstudy.validation.datasource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class MultipartDataSource {
    @Bean("master")
    public DataSource masterDataSource(){
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        return dataSourceBuilder
                .url("validation:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8")
                .driverClassName("com.mysql.validation.Driver")
                .username("root")
                .password("password").build();

    }


    @Bean("slave")
    public DataSource slaveDataSource(){
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        return dataSourceBuilder
                .url("validation:mysql://localhost:3306/sys?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8")
                .driverClassName("com.mysql.validation.Driver")
                .username("root")
                .password("password").build();

    }

}
