package Gun01;

import org.testng.annotations.*;


    /*
        @BeforeClass      -->   Class ın başında çalışacak   (driver işlemleri)
           @BeforeMethod  -->   Her metoddan(test metodları) önce çalışacak
               @Test      -->   testlerin çalıştığı metodlar
               @Test      -->   testlerin çalıştığı metodlar
           @AfterMethod   -->   Her metoddan sonra çalışacak
        @AfterClass       -->   Class ın çalışmasının sonunda çalışacak (driver kapat)
     */


public class _04_Annotations {


    @Test
    public void Test1(){
        System.out.println("test 1 çalıştı");
    } // test method u

    @Test
    public void Test2(){
        System.out.println("test 2 çalıştı");
    } // test method u

    @BeforeClass
    public void BeforeClassBolumu(){
        System.out.println("Before Class Bolumu çalıştı");
    }

    @AfterClass
    public void AfterClassBolumu(){
        System.out.println("After Class Bolumu çalıştı");
    }

    @BeforeMethod
    public void BeforeMethodBolumu(){
        System.out.println("Before Method Bolumu çalıştı");
    }

    @AfterMethod
    public void AfterMethodBolumu(){
        System.out.println("After Method Bolumu çalıştı");
    }


}
