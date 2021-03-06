package com.controls.pages.surrounding.pageBlocks;

import com.controls.pages.surrounding.entities.Plate;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.core.interfaces.complex.IComboBox;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.core.interfaces.complex.IDropList;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.DropList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@JPage(url = "/page2.htm", title = "Metal and Colors")
public class MetalsColorsForm extends Form<Plate> {

    @FindBy(id = "summary-block")
    private MetalsColorsFormSummarySection metalsColorsFormSummarySection = new MetalsColorsFormSummarySection();

    @FindBy(css = "#elements-checklist label")
    private ICheckList elementsCheckList;

    @JDropdown(
            root = @FindBy(css = ".btn.dropdown-toggle.selectpicker.btn-default"),
            value = @FindBy(css = ".colors .filter-option"),
            elementByName = @FindBy(css = ".colors li span")
    )
    private IDropDown colorsDropdown;

    private IComboBox metalsComboBox = new ComboBox(By.cssSelector(".metals .caret"),
            By.cssSelector(".metals li span"), By.cssSelector(".metals input"));

    private IDropList saladDroplist = new DropList(By.cssSelector(".salad .caret"),
            By.cssSelector(".salad li label"));

    @FindBy(id = "submit-button")
    private IButton submit;

    @Override
    public void submit(Plate plate) {
        metalsColorsFormSummarySection.odds.select(plate.odds);
        metalsColorsFormSummarySection.even.select(plate.even);
        elementsCheckList.select(plate.elementsCheckList);
        colorsDropdown.click();
        colorsDropdown.select(plate.color);
        /* UNUSED BECAUSE IT IS A BUG
        saladDroplist.select("Salad");*/
        saladDroplist.select(plate.saladDroplist);
        super.submit(plate);
    }

    public void uncheckElements(Plate plate){
        elementsCheckList.select(plate.elementsCheckList);
    /* UNUSED BECAUSE IT IS A BUG
        saladDroplist.select(plate.saladDroplist);
        saladDroplist.select("Salad");*/
    }
}
