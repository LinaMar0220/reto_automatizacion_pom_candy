package co.inglina.steps;

import co.inglina.pages.TematicaFiestaPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class TematicaFiestaStep {
    @Page
    TematicaFiestaPage tematicaFiestaPage;

    @Step
    public void seleccionarTematicaFiesta(String tematica){
        tematicaFiestaPage.SeleccionarTemaZombie(tematica);
    }

}
