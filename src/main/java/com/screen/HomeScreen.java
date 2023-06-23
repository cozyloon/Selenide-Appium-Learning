package com.screen;

import com.codeborne.selenide.appium.AppiumSelectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.ScreenObject.screen;

public class HomeScreen {
    private By product = AppiumSelectors.withContentDescription("store item");

    public ProductDescriptionScreen clickProduct1() {
        $(product).should(visible).click(tap());
        return screen(ProductDescriptionScreen.class);
    }

}
