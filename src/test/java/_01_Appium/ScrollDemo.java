package _01_Appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollDemo extends BaseTest {//
    @Test
    public void ScrollDemoTest() throws MalformedURLException, InterruptedException {

        //scroll mhareketi bu kodla yapılır
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(3000);

        // ufak tefek hareketlerde kullanılır
        scrollToEndAction(); //method yapıldı
        Thread.sleep(3000);
    }
}
////