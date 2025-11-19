package lippia.web.constants;

public class CarritoConstants {
    public static final String BOTON_ADD_PRODUCTO_CARRITO_XPATH = "xpath://*[@id=\"add-to-cart-%s\"]";
    public static final String BOTON_REMOVER_PRODUCTO_CARRITO_XPATH = "xpath://*[@id='remove-%s']";
    public static final String CONTADOR_NUMERO_CARRITO = "xpath://*[@id=\"shopping_cart_container\"]/a/span";
    public static final String PRODUCT_PRICE_XPATH = "xpath://div[text()='%s']/ancestor::div[1]/following-sibling::div[@class='pricebar']//div[@class='inventory_item_price']";
    public static final String OVERVIEW_PRODUCT_NAME = "//div[@class='inventory_item_name']";
    public static final String OVERVIEW_PRODUCT_PRICE = "//div[@class='inventory_item_price']";
}
