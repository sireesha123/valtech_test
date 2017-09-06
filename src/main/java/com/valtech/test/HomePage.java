package com.valtech.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends DriverManager {

    @FindBy(css = ".news-post__listing-header")
    private WebElement _latestNewsLink;

    @FindBy(css = ".navigation__menu__item>a>span")
    private List<WebElement> _headerNavigation;

    public boolean isOnHomePage() {
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl().endsWith("valtech.com/");
    }

    public String isLatestNewsLink() {
        return _latestNewsLink.getText();
    }


    public void selectOptionFromNavigation(String option) {
        for (WebElement element : _headerNavigation) {
            if (element.getText().equalsIgnoreCase(option)) {
                element.click();
                break;
            }
        }
    }
}
