package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelloTest {


    WebDriver driver;



    @Test
    public void I_Am_Running_100_Test(){


        TC001();TC002();TC100();


    }


    public void TC001(){
        System.out.println("This is Test Case 001");

    }

    public void TC002(){
        System.out.println("This is Test Case 002");

    }

    public void TC100(){
        System.out.println("This is Test Case 100");

        driver.findElement(By.className("lnXdpd")).isDisplayed();

        System.out.println();

    }





}
