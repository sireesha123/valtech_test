package com.valtech.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager;

    public Hooks(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Before
    public void setUp() {
        driverManager.openBrowser();
        driverManager.navigateTo("https://www.valtech.com");
        driverManager.maximizeWindow();
        driverManager.applyWaits();
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}
