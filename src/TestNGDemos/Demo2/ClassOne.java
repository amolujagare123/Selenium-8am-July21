package TestNGDemos.Demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {






    @Test
    public void classONeTest1()
    {
        System.out.println("classONeTest1");

    }

    @Test //(enabled = false)
    public void classONeTest2()
    {
        System.out.println("classONeTest2");
    }

    @Test
    public void classONeTest3()
    {
        System.out.println("classONeTest3");
    }
}
