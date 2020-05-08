package com.example.testController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


//    @PreAuthorize("hasAuthority('BookAdd')")
    @RequestMapping(value = "testtt",method = RequestMethod.GET)
    public  String testA(){
        System.out.println( "入口" );
        return   "我勒个去";
    }
}
