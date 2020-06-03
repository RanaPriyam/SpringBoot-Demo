package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("Writer2")
public class HelperWriter2 implements TextWriter{
    public String WriteText(String s){
        return s+" Helper Writer2!";
    }
}
