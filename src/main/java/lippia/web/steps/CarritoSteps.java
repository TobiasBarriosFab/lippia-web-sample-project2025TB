package lippia.web.steps;


import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CarritoService;
import lippia.web.services.LoginService;


public class CarritoSteps extends PageSteps {
    @Given("^el usuario ingresa su usuario (.*) y su contraseña (.*) en la pagina Sausodemo$")
    public void elUsuarioIngresaSuUsuarioYSuContraseñaEnLaPaginaSausodemo(String pUser, String pPass) {
        LoginService.navePage();
        LoginService.ingresarUsuario(pUser);
        LoginService.ingresarPassword(pPass);
        LoginService.clickBotonLogin();
    }

    @When("^el usuario agrega el producto (.*) al carrito$")
    public void elUsuarioAgregaElProductoAlCarrito(String pProducto) {
        CarritoService.agregarProductoCarrito(pProducto);
    }

    @Then("^se verifica que el contador del carrito es (.*)$")
    public void seVerificaQueElContadorDelCarritoEs(String pContCarrito) {
        CarritoService.verificarContadorCarrito(pContCarrito);
    }


    @And("^el usuario hace click en el boton Remove del producto (.*)$")
    public void elUsuarioHaceClickEnElBotonRemoveDelProducto(String pProducto) {
        CarritoService.removerProductoCarrito(pProducto);

    }

    @Then("se verifica que el contador del carrito no es visible")
    public void seVerificaQueElContadorDelCarritoNoEsVisible() {
        CarritoService.verificarCarritoVacio();

    }
}
