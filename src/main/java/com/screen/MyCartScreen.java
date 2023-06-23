package com.screen;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.appium.AppiumSelectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.ScreenObject.screen;

public class MyCartScreen {
    int index = 1;
    private By btnRemoveItem = By.xpath("(//android.view.ViewGroup[@content-desc='remove item'])[" + index + "]/android.widget.TextView");
    private By btnCheckOut = AppiumSelectors.byContentDescription("Proceed To Checkout button");
    private By txtTotalPrice = AppiumSelectors.byContentDescription("total price");
    private By btnGoShopping = AppiumSelectors.byContentDescription("Go Shopping button");

    public void clickCheckoutButton() {
        $(txtTotalPrice).shouldBe(Condition.visible).shouldHave(Condition.text("$89.97"));
        $(btnCheckOut).shouldBe(Condition.interactable).click(tap());
    }

}
