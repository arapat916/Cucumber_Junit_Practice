package com.myproject.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Driver {

    private Driver() {
    }


    private static ThreadLocal <WebDriver> driverPool = new ThreadLocal<>();


    public static WebDriver getDriver() {
        if (driverPool.get() == null) {

            synchronized (Driver.class) {
                String browser = ConfigurationReader.getProperty("browser");
                switch (browser) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        break;

                    case "remote-chrome":
                        try {
                            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                            desiredCapabilities.setBrowserName("chrome");
                            URL gridURL = new URL("http://3.87.8.245:4444/wd/hub");
                            driverPool.set(new RemoteWebDriver(gridURL, desiredCapabilities));
                            ;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case "remote-firefox":
                        try {
                            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                            desiredCapabilities.setBrowserName("firefox");
                            URL gridURL = new URL("http://3.87.8.245:4444/wd/hub");
                            driverPool.set(new RemoteWebDriver(gridURL, desiredCapabilities));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    default:
                        throw new RuntimeException("no such a browser!");
                }
            }
        }
        return driverPool.get();

    }


        public static void closeDriver () {
            if (driverPool.get() != null) {
                driverPool.get().quit();
                driverPool.remove();
            }
        }
    }
