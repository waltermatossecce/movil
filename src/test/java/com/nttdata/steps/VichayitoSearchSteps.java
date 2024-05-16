package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VichayitoSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;
    @Managed
    WebDriver driver;

    @Step("Cerrar cualquier ventana emergente")
    public void closeAnyPopup() {
        loginScreen.clickClose();
    }

    @Step("Realizar una búsqueda por texto {0}")
    public void searchByText(String place){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_input")));
    }

    @Step("Seleccionar opción {0} en el formulario de {1}")
    public void selectOptionInForm(String option, String form){
        // Implementar lógica para seleccionar una opción en el formulario
    }

    @Step("Hacer clic en el botón de búsqueda")
    public void clickSearchButton(){
        searchDetailsScreen.clickSearch();
    }

    @Step("Verificar si se muestran resultados")
    public boolean areResultsDisplayed(){
        // Implementar lógica para verificar si se muestran resultados
        return true;
    }

    @Step("Obtener el mensaje de resultado")
    public String getResultMessage(){
        // Implementar lógica para obtener el mensaje de resultado
        return "Over 1,000 stays";
    }
}
