package co.inglina.stepdefinitions;

import co.inglina.steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

import java.util.List;
import java.util.Map;

public class AsistenciaFiestaStepDefinition {

    @Steps
    InicioStep inicioStep;

    @Steps
    TipoFiestaStep tipoFiestaStep;

    @Steps
    TematicaFiestaStep tematicaFiestaStep;

    @Steps
    InformacionStep informacionStep;

    @Steps
    FiestaStep fiestaStep;

    @Given("el usuario esta en la pagina")
    public void elUsuarioEstaEnLaPagina() {
        inicioStep.configurarNavegador();
        inicioStep.cerrarVentanaEmergente();
    }

    @And("ingrese a la opcion deseada para la fiesta")
    public void ingreseALaOpcionDeseadaParaLaFiesta() {
        inicioStep.seleccionarMenuCandy();
    }

   @And("selecciona el tipo de fiesta como anfitrion")
    public void seleccionaElTipoDeFiestaComoAnfitrion() {
        tipoFiestaStep.seleccionarTipoFiesta();
    }

    @And("selecciona el tipo de fiesta como invitado")
    public void seleccionaElTipoDeFiestaComoInvitado() { tipoFiestaStep.seleccionarInvitado();
    }

    @When("seleccione la tematica {word}")
    public void seleccioneLaTematica(String tematica) {
        tematicaFiestaStep.seleccionarTematicaFiesta(tematica);
    }

    @And("diligencie la informacion requerida")
    public void diligencieLaInformacionRequerida(List<Map<String, String>> infoUsuario) {
        informacionStep.indicarCantidadAcompanantes(infoUsuario.get(0).get("numeroAcompanante"));
        informacionStep.escribirElCorreo(infoUsuario.get(0).get("email"));
        informacionStep.enviarInfo();
        informacionStep.masInformacion();
    }

    @Then("vizualiza el siguiente mensaje {string}")
    public void vizualizaElSiguienteMensaje(String mensaje) {
        fiestaStep.validarFiestaLista(mensaje);
    }

}


