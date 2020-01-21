package com.springcloudstudy.restful.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Person {
    private String id;
    private String name;

}
