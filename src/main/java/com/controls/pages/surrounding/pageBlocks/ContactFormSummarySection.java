package com.controls.pages.surrounding.pageBlocks;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.complex.IRadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

public class ContactFormSummarySection extends Section{/*
    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/form/div[3]/div[1]/section/div[2]/div/section[1] p")
    public IRadioButtons odds;
    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/form/div[3]/div[1]/section/div[2]/div/section[2] p")
    public IRadioButtons even;*/
    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/form/div[3]/div[1]/section/div[2]/div/div/button")
    public IButton calculate;
}
