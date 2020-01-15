package com.ZEROBANK.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample {

    public static void main(String[] args) throws MalformedURLException {
        //URL class from Java.net

        //Create URL for the Hub
        URL url = new URL("http://localhost:4444/wd/hub");

        //create Chrome Options
        ChromeOptions chromeOptions= new ChromeOptions();

        //RemoteDriver == used to open browser remotely using grid
        WebDriver driver = new RemoteWebDriver(url, chromeOptions);

        driver.get("https://selenium.dev");
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
