package co.inglina.steps;

import co.inglina.pages.InicioPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioStep {
    @Page
    InicioPage inicioPage;

    @Step
    public void configurarNavegador() {
        inicioPage.maximizarNavegador();
        inicioPage.open();

    }

    public void cerrarVentanaEmergente() {
        inicioPage.cerrarPopUp();
    }

    public void seleccionarMenuCandy() {
        inicioPage.seleccionarMenu();
    }
}
