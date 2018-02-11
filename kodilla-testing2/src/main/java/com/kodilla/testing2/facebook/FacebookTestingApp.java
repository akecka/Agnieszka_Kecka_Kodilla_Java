package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private final static String XPATH_DAY = "//*[@id='day']";
    private final static String XPATH_MONTH = "//*[@id='month']";
    private final static String XPATH_YEAR = "//*[@id='year']";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.xpath(XPATH_DAY));
        Select select = new Select(element);
        select.selectByValue("21");
        element = driver.findElement(By.xpath(XPATH_MONTH));
        select = new Select(element);
        select.selectByValue("1");
        element = driver.findElement(By.xpath(XPATH_YEAR));
        select = new Select(element);
        select.selectByValue("1988");

    }

}
