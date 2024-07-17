package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TipoFiestaPage extends InicioPage {
    @FindBy(xpath = "//a[@href='/host-a-party-1']")
    WebElementFacade linkHostingParty;

    @FindBy(xpath = "//a[@href='/attend-a-party']")
    WebElementFacade linkAttendingParty;

    public void seleccionarFiestaTipoAnfitrion() {
        linkHostingParty.click();
    }

    public void seleccionarFiestaTipoInvitado() {
        linkAttendingParty.click();
    }
}