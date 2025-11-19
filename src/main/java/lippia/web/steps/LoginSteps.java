package lippia.web.steps;

import com.crowdar.core.PageSteps;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;


public class LoginSteps extends PageSteps {

    @Given("el usuario se encuentra en la pagina Saucedemo")
    public void elUsuarioSeEncuentraEnLaPaginaSaucedemo() {
        LoginService.navePage();
    }

    @When("^el usuario ingresa en el campo username (.*)$")
    public void elUsuarioIngresaEnElCampoUsername(String pUser) {
        LoginService.ingresarUsuario(pUser);
    }

    @And("^el usuario ingresa en el campo password (.*)$")
    public void elUsuarioIngresaEnElCampoPassword(String pPass) {
        LoginService.ingresarPassword(pPass);
    }

    @And("el usuario hace click en el boton Login")
    public void elUsuarioHaceClickEnElBotonLogin() {
        LoginService.clickBotonLogin();
    }

    @Then("el usuario se loguea exitosamente y visualiza los productos")
    public void elUsuarioSeLogueaExitosamenteYVisualizaLosProductos() {
        LoginService.verificarLogueoExitoso();
    }

    @Then("^el usuario visualiza la leyenda (.*)$")
    public void elUsuarioVisualizaLaLeyenda(String errorMsj) {
        LoginService.verificarLogueoFallido(errorMsj);

    }


}

   
