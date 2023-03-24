package _01_Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Testing extends BrowserBaseTest{

    @Test
    public void Test1() throws InterruptedException {

        driver.get("https://www.zero2hero.com.au/");
        driver.findElement(By.cssSelector("a[class='btn ']")).click();


    }

}
////