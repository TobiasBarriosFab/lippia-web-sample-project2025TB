package lippia.web.services;

import com.crowdar.core.MyThreadLocal;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.CarritoConstants;

public class CarritoService extends WebActionManager {
    private static String addProductLocator(String pNombreProducto){
        String nombreProducto = pNombreProducto.toLowerCase().replace(" ", "-");
        return String.format(CarritoConstants.BOTON_ADD_PRODUCTO_CARRITO_XPATH,nombreProducto);

    }
    private static String removeProductLocator(String pNombreProducto){
        String nombreProducto = pNombreProducto.toLowerCase().replace(" ", "-");
        return String.format(CarritoConstants.BOTON_REMOVER_PRODUCTO_CARRITO_XPATH,nombreProducto);
    }

    public static void agregarProductoCarrito(String pProducto){
        double precio = Double.parseDouble(getText(String.format(CarritoConstants.PRODUCT_PRICE_XPATH, pProducto)).replace("$", ""));
        MyThreadLocal.setData(pProducto, precio);
        Assert.assertTrue("No se puede agregar el producto", waitPresence(addProductLocator(pProducto)).isDisplayed());
        click(addProductLocator(pProducto), true);
        Assert.assertTrue("El producto no esta comprado", waitPresence(removeProductLocator(pProducto)).isDisplayed());
    }
    public static void removerProductoCarrito(String pProducto) {
        Assert.assertTrue("El producto no esta comprado", waitPresence(removeProductLocator(pProducto)).isDisplayed());
        click(removeProductLocator(pProducto), true);
    }


    public static void verificarContadorCarrito(String pContCarrito){
        Assert.assertTrue("No se visualiza el contador del carrito", isPresent(CarritoConstants.CONTADOR_NUMERO_CARRITO));
        Assert.assertEquals("Numero de contador carrito no es el esperado", pContCarrito, getElement(CarritoConstants.CONTADOR_NUMERO_CARRITO).getText());
    }

    public static void verificarCarritoVacio(){
        Assert.assertFalse("El carrito no esta vacio", isPresent(CarritoConstants.CONTADOR_NUMERO_CARRITO));
    }
}
