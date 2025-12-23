package lippia.web.services;

import com.crowdar.core.MyThreadLocal;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.CarritoConstants;
import lippia.web.constants.CompraConstants;



public class CompraService extends WebActionManager {
    public static void irAlCarrito (){
        click(CompraConstants.BOTON_CARRITO_PATH, true);

    }
    public static void clickCheckout(){
        click(CompraConstants.BOTON_CHECKOUT_PATH);
    }
    public static void campoFirstName(String pNombre){
        setInput(CompraConstants.CAMPO_FIRST_NAME_PATH,pNombre);
    }
    public static void campoLastName(String pApellido){
        setInput(CompraConstants.CAMPO_LAST_NAME_PATH,pApellido);
    }
    public static void campoCodPostal(String pCodPostal){
        setInput(CompraConstants.CAMPO_ZIP_COD_POSTAL_PATH,pCodPostal);
    }
    public static void clickBotonContinuar(){
        click(CompraConstants.BOTON_CONTINUAR_PATH, true);
    }
    public static void validarPagCarrito(){
        Assert.assertTrue("El usuario no esta en la pagina del carrito", waitPresence(CompraConstants.TITULO_CARRITO_PATH).isDisplayed());
    }
    public static void validarPagCheckout(){
        Assert.assertTrue("El usuario no se encuentra en la pagina del checkout", waitPresence(CompraConstants.TITULO_CHECKOUT_PATH).isDisplayed());
    }
    public static void validarPagOverview(){
        Assert.assertTrue("El usuario no se encuentra en la pagina del checkout", waitPresence(CompraConstants.TITULO_OVERVIEW_PATH).isDisplayed());

    }
    public static void validarNombreProducto(String pNombreProducto){
        String locator = String.format(CompraConstants.NOMBRE_PRODUCTO_OVERVIEW_XPATH, pNombreProducto);
        Assert.assertTrue("El producto no esta presente en la pagina Overview", waitPresence(locator).isDisplayed());
    }
    public static void validarPrecioProducto(String pNombreProducto){
        double precioEsperado = (double) MyThreadLocal.getData(pNombreProducto);
        double precioActual = Double.parseDouble(getText(String.format(CompraConstants.PRECIO_PRODUCTO_OVERVIEW_XPATH, pNombreProducto)).replace("$", ""));
        Assert.assertEquals("El precio del producto "+ pNombreProducto+" no es el esperado",precioEsperado,precioActual);
    }
    public static void clickFinalizar(){
        click(CompraConstants.BOTON_FINALIZAR_PATH, true);
    }
    public static void verificarCompraFinalizada(String pMensaje){
        Assert.assertEquals("El mensaje no es el esperado", pMensaje, getElement(CompraConstants.TITULO_FINALIZAR_COMPRA_XPATH).getText());
    }
    public static void verificarMensajeError(String mensajeEsperado) {
        String mensajeActual = getElement(CompraConstants.MENSAJE_ERROR_CHECKOUT_XPATH).getText();
        Assert.assertEquals("El mensaje de error no es el esperado", mensajeEsperado, mensajeActual);
    }
}
