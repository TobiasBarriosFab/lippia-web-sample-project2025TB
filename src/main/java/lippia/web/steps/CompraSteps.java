package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CarritoService;
import lippia.web.services.CompraService;



public class CompraSteps extends PageSteps {



    @Then("el usuario hace click en el carrito")
    public void elUsuarioHaceClickEnElCarrito() {
        CompraService.irAlCarrito();
    }


    @And("el usuario hace click en el boton de Checkout")
    public void elUsuarioHaceClickEnElBotonDeCheckout() {
        CompraService.clickCheckout();

    }

    @And("^el usurio completa el campo First Name con su nombre (.*)$")
    public void elUsurioCompletaElCampoFirstNameConSuNombre(String pNombre) {
        CompraService.campoFirstName(pNombre);
    }

    @And("^el usuario completa el campo Last Name con su apellido (.*)$")
    public void elUsuarioCompletaElCampoLastNameConSuApellido(String pApellido) {
        CompraService.campoLastName(pApellido);
    }

    @And("^el usuario completa el campo Zip\\/Postal Code con su codigo postal (.*)$")
    public void elUsuarioCompletaElCampoZipPostalCodeConSuCodigoPostal(String pCodPostal) {
        CompraService.campoCodPostal(pCodPostal);
    }

    @Then("el usuario hace click en el boton continuar")
    public void elUsuarioHaceClickEnElBotonContinuar() {
        CompraService.clickBotonContinuar();
    }



    @Then("el usuario esta en la pagina del carrito")
    public void elUsuarioEstaEnLaPaginaDelCarrito() {
        CompraService.validarPagCarrito();
    }

    @Then("el usuario se encuentra el la pagina de Chekout")
    public void elUsuarioSeEncuentraElLaPaginaDeChekout() {
        CompraService.validarPagCheckout();
    }

    @Then("el usuario se encuentra en la pagina de Overview")
    public void elUsuarioSeEncuentraElLaPaginaDeOverview() {
        CompraService.validarPagOverview();
    }


    @And("^el usuario verifica que el producto (.*) se muestra en la pagina de Overview$")
    public void elUsuarioVerificaQueElProductoSeMuestraEnLaPaginaDeOverview(String pNombreProducto) {
        CompraService.validarNombreProducto(pNombreProducto);
    }

    @And("^el usuario verifica que el precio del producto (.*) es correcto$")
    public void elUsuarioVerificaQueElPrecioDelProductoEsCorrecto(String pNombreProducto) {
        CompraService.validarPrecioProducto(pNombreProducto);
    }

    @When("el usuario hace click en el boton Finish")
    public void elUsuarioHaceClickEnElBotonFinish() {
        CompraService.clickFinalizar();

    }

    @And("^el usuario visualiza la epica (.*)$")
    public void elUsuarioVisualizaLaEpica(String pMensaje) {
        CompraService.verificarCompraFinalizada(pMensaje);
    }

    @Then("^el usuario visualiza el mensaje (.*)$")
    public void elUsuarioVisualizaElMensaje(String mensajeError) {
        CompraService.verificarMensajeError(mensajeError);

    }
}
