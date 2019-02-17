package main.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider {
    private static WebDriver driver;


    public static WebDriver getDriver(){
        if (driver==null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }

    public static boolean getPageSource(String contain) {
        if(driver.getPageSource().contains(contain)) {
            return true;
        } else return false;
    }
}
