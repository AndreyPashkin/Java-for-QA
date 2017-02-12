package ru.javaqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Андрей on 06.02.2017.
 */
public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoHomePage() {
        click(By.cssSelector("#nav ul li > a"));
    }

    public void gotoGroupPage() {
        click(By.cssSelector(".admin > a:nth-child(1)"));
    }

}
