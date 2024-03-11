package Gun03;

import org.testng.annotations.Test;

public class _01_Groups {

    @Test(groups = {"Smoke Test"}) // grup etiketi verdi
    public void Test1(){ System.out.println("test1"); }

    @Test(groups = {"Regression"})
    public void Test3(){ System.out.println("test3"); }

    @Test(groups = {"Regression"})
    public void Test5(){ System.out.println("test5"); }

    @Test(groups = {"Regression"})
    public void Test2(){ System.out.println("test2"); }

    @Test(groups = {"Smoke Test"})
    public void Test4(){ System.out.println("test4"); }

    @Test(groups = {"Smoke Test"})
    public void Test6(){ System.out.println("test6"); }

    @Test
    public void Test7(){ System.out.println("test7"); }

}
