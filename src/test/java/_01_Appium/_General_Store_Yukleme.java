package _01_Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class _General_Store_Yukleme {
    @Test
    public void GeneralStoreDownload() throws MalformedURLException {
        //

        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("ORC1A");
        options.setApp("C:/Users/Orcun/IdeaProjects/New_Android1_/src/test/java/resources/General-Store.apk");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
    }
}
