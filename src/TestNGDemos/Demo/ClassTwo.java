package TestNGDemos.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"user","password"})
    @Test
    public void classTwoTest1(String s1,String s2)
    {
        System.out.println("classTwoTest1");
        System.out.println("user="+s1);
        System.out.println("Pass="+s2);
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
