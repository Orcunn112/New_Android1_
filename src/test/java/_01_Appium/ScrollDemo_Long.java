package _01_Appium;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollDemo_Long extends BaseTest {

    @Test
    public void ScrollDemoTest() throws MalformedURLException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(3000);

        // ufak tefek hareketlerde kullanılır
//        scrollToEndAction();
        Thread.sleep(3000);
    }
}
///