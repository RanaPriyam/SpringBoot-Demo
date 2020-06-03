package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("Writer1")
public class HelperWriter implements TextWriter{
    public String WriteText(String s){
        return s+" Helper Writer1!";
    }
}
