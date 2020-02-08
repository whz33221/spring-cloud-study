package com.springcloudstudy.validation.controller;

import com.springcloudstudy.validation.annotation.IRADStart;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotNull
    @Max(100000)
    private Long id;
    @NotNull
    private String name;
    @IRADStart
    private String IRADName;
}
