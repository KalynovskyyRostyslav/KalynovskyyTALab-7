package com.epam.lab.loger;

import org.apache.log4j.PropertyConfigurator;

import java.util.logging.Logger;

public class TestException {
    private static final Logger LOGER = Logger.getLogger(Log4J.class);
    public static void main(String[] args) throws MyException {
        PropertyConfigurator.configure("src/resources/log4j.properties");
        int result = 0;

        try{
            result = getAreaValue(-1, 100);
        }catch(IllegalArgumentException e){
           LOGER.error("Here is a negative number on input");
            throw new MyException(e);
        }
        System.out.println("Result is : "+result);
    }

    public static int getAreaValue(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y;
    }
}
