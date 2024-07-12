package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TipoFiestaPage extends InicioPage{
    @FindBy(xpath = "//a[@href='/host-a-party-1']")
    WebElementFacade linkHostingParty;

    public void seleccionarFiestaTipoAnfitrion(){
        linkHostingParty.click();
    }
}
