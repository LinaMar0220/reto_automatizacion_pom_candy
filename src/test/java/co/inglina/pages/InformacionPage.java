package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static co.inglina.utils.Constantes.*;

public class InformacionPage extends TematicaFiestaPage{
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
        selectAcompanante.click();
        selectAcompanante.selectByValue("1");
    }

    public void ingresarEmail(String email){
        inputemail.sendKeys(email);
               // .type("pruebas@gmail.com");
    }

    public void enviarInformacion(){
        //buttonEnviar.waitUntilClickable();
        buttonEnviar.click();
    }

    public void ir(){
        //linkIr.waitUntilClickable();
        linkIr.click();
    }
}
