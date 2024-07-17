package co.inglina.steps;

import co.inglina.pages.InformacionPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InformacionStep {
    @Page
    InformacionPage informacionPage;

    @Step
    public void indicarCantidadAcompanantes(String numeroAcompanante) {
        informacionPage.SeleccionarAcompanante(numeroAcompanante);
    }

    public void escribirElCorreo(String email) {
        informacionPage.ingresarEmail(email);
    }

    public void enviarInfo() {
        informacionPage.enviarInformacion();
    }

    public void masInformacion() {
        informacionPage.ir();
    }
}
