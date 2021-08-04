package TestNGDemos.Demo;

import org.testng.annotations.*;

public class ClassOne {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite");
    }


    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite");
    }



    @Parameters({"user","password"})
    @Test
    public void classONeTest1(String s1,String s2)
    {
        System.out.println("classONeTest1");
        System.out.println("user="+s1);
        System.out.println("Pass="+s2);
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
