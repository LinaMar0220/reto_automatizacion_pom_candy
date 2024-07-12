package co.inglina.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static co.inglina.utils.Constantes.MAPEOTEMATICA;
import static co.inglina.utils.Constantes.TEMATICA;

public class TematicaFiestaPage extends TipoFiestaPage{

    public void SeleccionarTemaZombie(String tematica){
        WebElementFacade linkFiestaZombie = getMaping(MAPEOTEMATICA, TEMATICA, tematica);
        //linkFiestaZombie.waitUntilEnabled().waitUntilClickable();
        linkFiestaZombie.click();

    }
}
