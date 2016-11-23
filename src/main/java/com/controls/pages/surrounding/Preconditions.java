package com.controls.pages.surrounding;

import com.controls.pages.surrounding.fillingTypes.User;
import com.epam.commons.linqinterfaces.JAction;
import com.epam.jdi.uitests.web.selenium.preconditions.WebPreconditions;

import java.util.function.Supplier;

import static com.controls.JDITestSite.homePage;
import static com.controls.JDITestSite.login;
import static com.controls.JDITestSite.metalsColorsPage;

public enum Preconditions implements WebPreconditions {
    LOGIN(
            () -> login.logout.isDisplayed(),
            () -> login.submit(User.DEFAULT)
    ),
    LOGOUT(
            () -> !login.logout.isDisplayed(),
            () -> login.logout.click()
    ),
    HOMEPAGE_OPENED(
            () -> homePage.verifyOpened(),
            () -> homePage.open()
    ),
    MCPAGE_OPENED(
            () -> metalsColorsPage.verifyOpened(),
            () -> metalsColorsPage.open()
    );

    public Supplier<Boolean> checkAction;
    public JAction moveToAction;

    Preconditions(Supplier<Boolean> checkAction, JAction moveToAction) {
        this.checkAction = checkAction;
        this.moveToAction = moveToAction;
    }

    public Boolean checkAction() {
        return checkAction.get();
    }

    public void moveToAction() {
        moveToAction.invoke();
    }
}
