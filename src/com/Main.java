package com;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
       // try{}catch(IOException t){}
        // throw new Error();//unchecked
        // throw new RuntimeException();//unchecked
        //throw new Throwable(); //ch
        //throw new Exception();//ch
       // throw new IOException();//ch

    }
}
class Base{
    void method()throws Exception{}
}
class Child extends Base{
    @Override
    void method() throws RuntimeException{

    }
}










