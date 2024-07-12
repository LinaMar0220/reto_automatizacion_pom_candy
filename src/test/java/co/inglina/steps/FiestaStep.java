package co.inglina.steps;

import co.inglina.pages.FiestaPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class FiestaStep {
    @Page
    FiestaPage fiestaPage;

    @Step
    public void validarFiestaLista(String mensaje) {
        fiestaPage.validarFiesta(mensaje);
    }
}
