package TestNG;

import org.testng.annotations.*;

public class TestNG {

    @BeforeSuite
    public void basesuite ()
    {
        System.out.println("Before suite");
    }
    @BeforeClass
    public void baseclass ()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public void Afterclass ()
    {
        System.out.println("After class");
    }
@Test
    public void Test ()
    {
        System.out.println("Test");
    }
    @AfterSuite
    public void Aftersuite ()
    {
        System.out.print("Aftersuite");
    }
    @BeforeMethod
    public void BeforeMethod ()
    {
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod ()
    {
        System.out.println("AfterMethod");
    }
  @BeforeTest
    public void BeforeTest ()
    {
        System.out.println("Before Test");
    }
  @AfterTest
    public void AfterTest ()
    {
        System.out.println("AfterTest");
    }




}
