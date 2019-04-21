package abcy.BrowserDriver;

import abcy.Utils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LearnJunit extends Utils
{
    //protected static WebDriver driver;

    @Before

    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\abcy\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        // this is to manage the time before it throws the error if the page is not loaded in the below time.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //asking driver to get the url
        driver.get("https://demo.nopcommerce.com");

        //window is maximize
        driver.manage().window().maximize();
    }

    @Test

    public void RegisterSuccessfully()

    {
        //Register for new user
        clickElemenetBY(By.xpath("//a[@class=\'ico-register\']"));

        //select  gender by id
        clickElemenetBY(By.id("gender-female"));

        //Enter  name by xpath
        enterText(By.xpath("//input[@id='FirstName']"),"Sonalben");

        //Enter the last name by xpath
        enterText(By.xpath("//input[@id='LastName']"),"Patel");

        //select birthday
        enterText(By.xpath("//select[@name='DateOfBirthDay']"),"5");

        //select birthday month
        enterText(By.xpath("//select[@name='DateOfBirthMonth']"),"March");

        //select  birthday year
        enterText(By.xpath("//select[@name='DateOfBirthYear']"),"1981");

        //Enter E-mail id
        enterText(By.xpath("//input[@id='Email']"),"goldy_dev2009@yahoo.com");

        //Enter company name
        enterText(By.xpath("//input[@id='Company']"),"london ltd");

        //Enter  password
        enterText(By.xpath("//input[@id='Password']"),"Sonal1");

        //confirm  password
        enterText(By.xpath("//input[@id='ConfirmPassword']"),"Sonal1");

        //click on register button
        clickElemenetBY(By.xpath("//input[@name='register-button']"));

        //this is to match up your expected results = actual results using class name in find Elements
        waiForElementDisplay(By.xpath("//div[@class='result']"),10);

        System.out.println("Expected Result : Your registration completed");

        driver.quit();


    }
}

