package abcy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.rmi.CORBA.Util;

public class Utils extends BasePage
{
    public static void clickElemenetBY(By by)
    {
        driver.findElement(by).click();
    }

    public static void enterText(By by,String text)
    {
        driver.findElement(by).sendKeys("text");
    }

    public static void selecTestByvalue(By by, String text)
    {
        Select select =new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static void waiForElementDisplay(By by,int time )
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }







}



