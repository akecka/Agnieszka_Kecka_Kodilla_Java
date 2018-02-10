package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static void main(String[] args) {
        WebDriver driver;
        WebElement element;
        Select select;

        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");
        element = driver.findElement(By.xpath("//*[@id='day']"));
        select = new Select(element);
        select.selectByValue("21");
        element = driver.findElement(By.xpath("//*[@id='month']"));
        select = new Select(element);
        select.selectByValue("1");
        element = driver.findElement(By.xpath("//*[@id='year']"));
        select = new Select(element);
        select.selectByValue("1988");

    }

}
