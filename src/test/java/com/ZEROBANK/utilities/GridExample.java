package com.ZEROBANK.utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample {

    public static void main(String[] args) throws MalformedURLException {
        //URL class from Java.net

        //Create URL for the Hub
        //**pay attention that this thing is copied from your hub but ends with ...../wd/hub instead
        //http://ec2-3-90-242-72.compute-1.amazonaws.com:4444/wd/hub

        URL url = new URL("http://ec2-3-90-242-72.compute-1.amazonaws.com:4444/wd/hub");

        //Create Firefox Options
//        FirefoxOptions firefoxOptions= new FirefoxOptions();



        //create Chrome Options
  //      ChromeOptions chromeOptions= new ChromeOptions();

        //RemoteDriver == used to open browser remotely using grid
    //    WebDriver driver = new RemoteWebDriver(url, chromeOptions);

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("firefox");
        desiredCapabilities.setPlatform(Platform.ANY);
        WebDriver driver= new RemoteWebDriver(url, desiredCapabilities);

        driver.get("https://selenium.dev");
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
