package com.screen;

import com.codeborne.selenide.appium.AppiumSelectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.AppiumClickOptions.doubleTap;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.ScreenObject.screen;

public class ProductDescriptionScreen {
    private By btnAddToCart = AppiumSelectors.withContentDescription("Add To Cart button");
    private By btnRedCircle = AppiumSelectors.withContentDescription("red circle");
    private By btnCounterPlus = AppiumSelectors.withContentDescription("counter plus button");
    private By btnCounterMinus = AppiumSelectors.withContentDescription("counter minus button");
    private By btn3rdReviewStar = AppiumSelectors.withContentDescription("review star 3");
    private By btnCloseModel = AppiumSelectors.withContentDescription("Close Modal button");
    private By btnCart = AppiumSelectors.withContentDescription("cart badge");

    public MyCartScreen clickAddToCartButton() {
        $(btnRedCircle).shouldBe(interactable).click(tap());
        $(btnCounterPlus).shouldBe(visible).click(doubleTap()).click(doubleTap());
        $(btnCounterMinus).shouldBe(visible).click(doubleTap());
        $(btn3rdReviewStar).shouldBe(visible).click(tap());
        $(btnCloseModel).shouldBe(visible).click(tap());
        $(btnAddToCart).shouldBe(visible).click(tap());
        $(btnCart).shouldBe(visible).click(tap());
        return screen(MyCartScreen.class);
    }
}
