package com.valtech.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavigatePage extends DriverManager {
    @FindBy(css = ".page-header>h1")
    private WebElement _h1Header;

    @FindBy(css = ".icons.glyph")
    private WebElement _contactUs;

    @FindBy(css = ".contactcities>li>a")
    private List<WebElement> _listOfCountries;

    public String isHeaderDisplayed() {
       return _h1Header.getText();
    }

    public void navigeToContactUs() {
         _contactUs.click();
    }

    public int getListOfCountries(){
       return _listOfCountries.size();
    }
}
