package co.inglina.steps;

import co.inglina.pages.TipoFiestaPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class TipoFiestaStep {
    @Page
    TipoFiestaPage tipoFiestaPage;

    @Step
    public void seleccionarTipoFiesta() {
        tipoFiestaPage.seleccionarFiestaTipoAnfitrion();
    }

    public void seleccionarInvitado(){tipoFiestaPage.seleccionarFiestaTipoInvitado();}
}
