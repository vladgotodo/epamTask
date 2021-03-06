package com.controls.pages.surrounding.generalBlocks;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Search;
import org.openqa.selenium.support.FindBy;

public class SearchField extends Search {
    @FindBy(css = ".search-field input")
    private ITextField searchInput;

    @FindBy(css = ".search .icon-search")
    private IButton searchButton;

    @Override
    public void findAction(String text) {
        searchButton.click();
        searchInput.sendKeys(text);
        searchButton.click();
    }
}
