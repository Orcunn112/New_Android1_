package _01_Appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserBaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {

        service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Orcun//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start(); // for manuel cmd service i

        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("ORC1A");
        options.setChromedriverExecutable("C://Users//Orcun//IdeaProjects//New_Android1_//src//test//java//resources//chromedriver.exe");
        // watch out the thing that we downloaded is chrome driver exe (chrome browser)
        options.setCapability("browserName","Chrome");


        driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

    }

//
    public Double getFormattedAmount(String amount){
        Double price=Double.parseDouble(amount.substring(1));
        return price;
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();

    }
}
