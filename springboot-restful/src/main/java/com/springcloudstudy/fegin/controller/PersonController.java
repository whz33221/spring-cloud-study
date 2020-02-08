package com.springcloudstudy.fegin.controller;

import com.springcloudstudy.fegin.rest.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable String id,
                            @RequestParam(required = false) String name) {
        Person person = new Person().setId(id).setName(name);
        return person;
    }

    @PostMapping("/person/json")
    public Person getPerson(@RequestBody Person person) {
        return person;
    }


//
//    @PostMapping(value = "/person/jsonToPro",
//                        consumes = MediaType.APPLICATION_JSON_VALUE,
//                        produces = "application/properties+person")

    @PostMapping(value = "/person/jsonToPro",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = "application/properties+person")
    public Person jsonToPro(@RequestBody Person person){
        return person;
    }

    @PostMapping(value = "/person/proToJson",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = "application/properties+person")
    public Person proToJson(@RequestBody Person person){
        return person;
    }

//    @PostMapping(value = "/person/proToJson",
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = "application/properties+person")
//    public Person proToJson(@RequestBody Person person){
//        return person;
//    }



}
