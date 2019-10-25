package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-25T13:20:37.580Z")

@RestSchema(schemaId = "projectk9fz")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectk9fzImpl {

    @Autowired
    private Projectk9fzDelegate userProjectk9fzDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectk9fzDelegate.helloworld(name);
    }

}
