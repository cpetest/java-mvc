package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectk9fz {

        Projectk9fzDelegate projectk9fzDelegate = new Projectk9fzDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectk9fzDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}