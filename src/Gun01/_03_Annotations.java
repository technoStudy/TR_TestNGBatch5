package Gun01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations {

    @Test
    public void Test1(){
        System.out.println("test 1 çalıştı");
    }

    @Test
    public void Test2(){
        System.out.println("test 2 çalıştı");
    }

    @BeforeClass
    public void BeforeClassBolumu(){
        System.out.println("Before Class Bolumu çalıştı");
    }

    @AfterClass
    public void AfterClassBolumu(){
        System.out.println("After Class Bolumu çalıştı");
    }

}
