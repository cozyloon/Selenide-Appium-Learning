package com.test;

import com.codeborne.selenide.appium.ScreenObject;
import com.codeborne.selenide.appium.SelenideAppium;
import com.screen.HomeScreen;
import org.testng.annotations.Test;


public class SelenideAndroidTest {

    //mvn clean test -Dselenide.browser=com.provider.SauceLabAndroidAppProvider

    @Test
    public void androidLaunchTest() {
        SelenideAppium.launchApp();
        ScreenObject.screen(HomeScreen.class)
                .clickProduct1()
                .addToCartButtonIsDisplayed();
    }
}
