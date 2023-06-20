package com.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.ScreenObject.screen;

public class HomeScreen {
    @AndroidFindBy(accessibility = "store item")
    private WebElement product1;

    public ProductDescriptionScreen clickProduct1() {
        $(product1).should(visible).click();
        return screen(ProductDescriptionScreen.class);
    }
}
