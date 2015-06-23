package com.ele.me.EasyDemo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;







import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mianflow {
	private AppiumDriver driver;
	@BeforeClass
	public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
       System.out.println(classpathRoot.getPath());
        File appDir = new File(classpathRoot, "./src/test/java/app");
//        System.out.println(appDir.getAbsolutePath());
        File app = new File(appDir, "imooc.apk");
        
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "4.2.2");
        capabilities.setCapability("plantfromname", "MAC");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("BROWSER_NAME", "");
//        capabilities.setCapability("automationName","Selendroid");
        
//        capabilities.setCapability("appPackage", "me.ele.talaris");
//        capabilities.setCapability("appActivity", "me.ele.talaris.CordovaApp");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        driver.manage().timeouts().implicitlyWait(16,TimeUnit.SECONDS);
    }
	
	@AfterClass
	public void tearDown() throws Exception {
        driver.quit();
    }
	
	@Test
	public void myMainflow() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//        Set<String> contextNames = driver.getContextHandles();
//        for (String contextName : contextNames) {
//
//            System.out.println(contextName);
//        }
//        driver.context("NATIVE_APP");
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).sendKeys("914425948@qq.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.EditText[1]")).sendKeys("xxxxxx");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
        Thread.sleep(3000);
        WebElement logintext = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
        Thread.sleep(3000);
        Assert.assertEquals("qq_雕刻时光_3",logintext.getText().toString());
//        driver.findElementByAccessibilityId("cn.com.open.mooc:id/title_tv").click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TableRow[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("python");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
       
       
//        driver.findElementByAccessibilityId("立即登录").click();
//        Thread.sleep(5000);
//        List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
//        textFieldsList.get(0).sendKeys("18576625748");
//        Thread.sleep(5000);
//        
////        driver.sendKeyEvent(AndroidKeyCode.BACK);
//        Thread.sleep(9000);
//        
//      
        
   
    }
	
}
