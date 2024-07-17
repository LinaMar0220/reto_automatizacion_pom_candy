package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import static co.inglina.utils.Constantes.TEMATICA;

public class TematicaFiestaPage extends TipoFiestaPage {

    public static final String MAPEOTEMATICA = "//a[text()='TEMATICA']";

    public void SeleccionarTemaZombie(String tematica) {
        WebElementFacade linkFiestaZombie = getMaping(MAPEOTEMATICA, TEMATICA, tematica);
        linkFiestaZombie.click();
    }
}
