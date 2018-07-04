package com.epam.lab.loger;

public class MyException extends Exception{
    public MyException(Throwable e) {
        initCause(e);
    }
}
