package test;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class lab262 { //class
     @Description("TC#1 -verify GEt Request 1")
    @Test
    public  void getRequest(){ //method1
        System.out.println("TC");
    }
    @Description("TC#1 -verify GEt Request 2")
    @Test
    public  void getRequest2(){//method2
        System.out.println("TC1");
    }
    @Description("TC#1 -verify GEt Request 3")
    @Test
    public  void getRequest3(){//method3
        System.out.println("TC2");
    }
}
