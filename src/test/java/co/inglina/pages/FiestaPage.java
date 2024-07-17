package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import static co.inglina.utils.Constantes.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FiestaPage extends InformacionPage {
    /*@FindBy(xpath = "//h1[text()='Your Halloween Party is almost here!']")
    WebElementFacade textFiestaOk;
    public void validarFiesta(String mensaje) {
        assertThat(textFiestaOk.getText(), is(equalTo(MSJFIESTAOK)));
    }*/

    public static final String MAPEOFIESTA = "//h1[text()='MSJFIESTAOK']";

    public void vFiesta(String fiestaOk) {
        WebElementFacade msjFiestaOk = getMaping(MAPEOFIESTA, MSJFIESTAOK, fiestaOk);
        assertThat(msjFiestaOk.isVisible(), is(true));
    }
}
