package _01_Appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class _LongPress extends BaseTest {

    @Test
    public void LongPressGesture() throws MalformedURLException, InterruptedException {


        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

        // long keep press durumunda bunu yazıyoruz yani uzuzn basılı tutma örnek select all ya da copy ya da paste ya da cut özelliği

        WebElement ele= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        LongpressAction(ele);

        Thread.sleep(2000);
        String manuText= driver.findElement(By.id("android:id/title")).getText();
        Assert.assertEquals(manuText,"Sample menu");
        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
    }
}
