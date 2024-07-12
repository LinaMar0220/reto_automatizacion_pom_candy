package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class InicioPage extends BasePage {
    @FindBy(xpath = "//a[@id='popup-widget238491-cta']")
    WebElementFacade buttonPopUp;

    @FindBy(xpath = "//a[@href='/halloween-party' and @data-ux= 'NavLink']")
    WebElementFacade linkHalloweenParty;

    public void cerrarPopUp(){
        buttonPopUp.waitUntilClickable();
        buttonPopUp.click();
    }

    public void seleccionarMenu(){
        linkHalloweenParty.click();
    }



    /*String paginaInicial = getDriver().getWindowHandle();

    @FindBy(xpath = "//a[@href='#sidebar']")
    WebElementFacade menuHamburguesa;

    @FindBy(xpath = "//iframe[@src='index.html']")
    WebElementFacade iframe;

    @FindBy(xpath = "//input[@value='Open Tab']")
    WebElementFacade buttonOpenTab;

    @FindBy(xpath = "//button[@onclick='alertTrigger()']")
    WebElementFacade buttonTriggerAlert;

    public void abrirMenuHamburguesa(){
        cambiarIframe(iframe);
        menuHamburguesa.click();
        regresarDelFrame();
    }

    public void abrirNuevaPestana(){
        buttonOpenTab.click();
    }

    public void abrirAlerta(){
        buttonTriggerAlert.click();
    }

    public void abrirMenuLateral(){
        regresarPaginaInicial(paginaInicial);
        menuHamburguesa.click();
    }*/
}
