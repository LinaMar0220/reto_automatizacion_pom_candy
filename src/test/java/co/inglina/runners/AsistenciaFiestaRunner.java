package co.inglina.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/asistencia_fiesta.feature",
        glue = "co.inglina.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AsistenciaFiestaRunner {
}
