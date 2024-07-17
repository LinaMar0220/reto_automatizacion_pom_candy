package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class InformacionPage extends BasePage {
    @FindBy(xpath = "//iframe[contains(@id,'frame')]")
    WebElementFacade iframeListaDesplegable;

    //@FindBy(xpath = "//select[@id='guests']//option[@value='1']")
    @FindBy(id = "guests")
    WebElementFacade selectAcompanante;

    @FindBy(id = "input7")
    WebElementFacade inputemail;

    @FindBy(xpath = "//button[text()='Remind Me']")
    WebElementFacade buttonEnviar;

    @FindBy(xpath = "//a[text()='Find out more']")
    WebElementFacade linkIr;

    public void SeleccionarAcompanante(String numeroAcompanante){
        iframeListaDesplegable.waitUntilPresent();
        cambiarIframe(iframeListaDesplegable);
        selectAcompanante.selectByValue(numeroAcompanante);
        regresarDelFrame();
    }

    public void ingresarEmail(String email) {
        inputemail.waitUntilPresent();
        inputemail.sendKeys(email);
        // .type("pruebas@gmail.com");
    }

    public void enviarInformacion() {
       buttonEnviar.click();
    }

    public void ir() {
        linkIr.click();
    }
}
