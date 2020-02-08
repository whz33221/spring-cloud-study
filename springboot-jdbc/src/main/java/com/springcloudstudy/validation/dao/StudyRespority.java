package com.springcloudstudy.validation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class StudyRespority {

    private final DataSource master;
    private final DataSource slave;
    @Autowired
    public StudyRespority(@Qualifier("master") DataSource master,@Qualifier("slave") DataSource slave) {
        this.master = master;
        this.slave = slave;
        System.out.println("完成初始化");
    }
}
