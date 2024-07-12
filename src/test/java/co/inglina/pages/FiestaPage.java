package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static co.inglina.utils.Constantes.MSJFIESTAOK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FiestaPage extends InformacionPage {
    @FindBy(xpath = "//h1[text()='Your Halloween Party is almost here!']")
    WebElementFacade textFiestaOk;

    public void validarFiesta(String mensaje)
    {
        assertThat(textFiestaOk.getText(),  is(equalTo(MSJFIESTAOK)));
    }
}
