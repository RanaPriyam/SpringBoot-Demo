package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Autowired
    @Qualifier ("Writer2")
    TextWriter text;
    //We can do without the constructor as well
//    public HelloWorld(TextWriter text){
//        //Remember we can't instantiate an interface
//        //text=new HelperWriter();//Not really a good practice
//        this.text=text;
//    }
    @RequestMapping("/")
    public String index(){

//        return "Hello world!";
        return text.WriteText("Hello");
    }
}
