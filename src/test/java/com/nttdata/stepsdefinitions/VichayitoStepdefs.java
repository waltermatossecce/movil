package com.nttdata.stepsdefinitions;

import com.nttdata.steps.VichayitoSearchSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class VichayitoStepdefs {

    @Steps
    VichayitoSearchSteps vichayitoSearchSteps;

    @Given("que estoy en la aplicación de Airbnb y cierro cualquier ventana emergente")
    public void que_estoy_en_la_aplicación_de_Airbnb_y_cierro_cualquier_ventana_emergente() {
        vichayitoSearchSteps.closeAnyPopup();
    }

    @When("realizo una búsqueda de {string}")
    public void realizo_una_búsqueda_de(String place) {
        vichayitoSearchSteps.searchByText(place);
    }

    @When("selecciono {string} en el formulario de {string}")
    public void selecciono_opción_en_el_formulario(String option, String form) {
        vichayitoSearchSteps.selectOptionInForm(option, form);
    }

    @When("hago clic en Search")
    public void hago_clic_en_search() {
        vichayitoSearchSteps.clickSearchButton();
    }

    @Then("debería ver resultados con más de 1 estancia y el mensaje {string}")
    public void debería_ver_resultados_con_más_de_1_estancia_y_el_mensaje(String text) {
        Assert.assertTrue(vichayitoSearchSteps.areResultsDisplayed());
        Assert.assertEquals(vichayitoSearchSteps.getResultMessage(), text);
    }
}
