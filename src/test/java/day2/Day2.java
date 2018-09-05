package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Day2 {



    @Test
    public void testGoogleSearch()
    {
        System.setProperty("webdriver.gecko.driver", "/Users/andrejkim/IdeaProjects/drivers/geckodriver");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://google.com");

       // WebDriverWait wait =new WebDriverWait(driver,10);
        //WebElement myDynamicElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#lst-id")));


        WebElement searchInput=driver.findElement(By.cssSelector("#lst-ib"));
        searchInput.sendKeys("Portnov");
        searchInput.submit();
    }
}


