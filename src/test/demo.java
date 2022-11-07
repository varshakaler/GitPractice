package test;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class demo{


    WebDriver driver;

    @Before
    public void setUp(){

        System.setProperty(
                "webdriver.chrome.driver",
                "/Users/mithunroy/Downloads/BrowserDrivers/chromedriver");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();

    }

    @Test
    public int FillingFacebookForm() throws Exception{

        int testResult  = 0;

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        driver.get("http://www.facebook.com/");


        // Doing a Sign Up

        driver.findElement(By.xpath("//FirstName")).sendKeys("ABCD");
        driver.findElement(By.xpath("//LastName")).sendKeys("ABCD");
        driver.findElement(By.xpath("//Email")).sendKeys(generatedString);
        driver.findElement(By.xpath("//Password")).sendKeys("ABCD");




        // To Validate Google logo ...
        driver.findElement(By.className("lnXdpd")).isDisplayed();


        //To Type Something in Google Search Text box ...

        driver.findElement(By.className("gLFyf gsfi")).sendKeys("Google");
        driver.findElement(By.name("q")).sendKeys("Google");

        driver.findElement(By.linkText("Products")).click();





        driver.findElement(By.id("")).click();
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.cssSelector("")).click();





        testResult = 1;

        return testResult;
    }




    public String  randomEmail() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString+"@gmail.com";
    }



    @After
    public void tearDown() {
        driver.quit();

    }
}