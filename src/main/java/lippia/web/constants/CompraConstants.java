package lippia.web.constants;

public class CompraConstants {
    public static final String BOTON_CHECKOUT_PATH = "xpath://*[@id=\"checkout\"]";
    public static final String BOTON_CARRITO_PATH = "xpath://*[@id=\"shopping_cart_container\"]/a";
    public static final String CAMPO_FIRST_NAME_PATH = "xpath://*[@id=\"first-name\"]";
    public static final String CAMPO_LAST_NAME_PATH = "xpath://*[@id=\"last-name\"]";
    public static final String CAMPO_ZIP_COD_POSTAL_PATH = "xpath://*[@id=\"postal-code\"]";
    public static final String BOTON_CONTINUAR_PATH = "xpath://*[@id=\"continue\"]";
    public static final String BOTON_FINALIZAR_PATH = "xpath://*[@id=\"finish\"]";
    public static final String TITULO_CARRITO_PATH = "xpath://*[@id=\"header_container\"]/div[2]/span";
    public static final String TITULO_CHECKOUT_PATH = "xpath://*[@id=\"header_container\"]/div[2]/span[text()=\"Checkout: Your Information\"]";
    public static final String TITULO_OVERVIEW_PATH = "xpath://*[@id=\"header_container\"]/div[2]/span[text()=\"Checkout: Overview\"]";
    public static final String NOMBRE_PRODUCTO_OVERVIEW_XPATH = "xpath://div[@class='inventory_item_name' and text()='%s']";
    public static final String PRECIO_PRODUCTO_OVERVIEW_XPATH = "xpath://div[@class='cart_item']//div[@class='inventory_item_name' and text()='%s']//following::div[@class='inventory_item_price'][1]";
    public static final String TITULO_FINALIZAR_COMPRA_XPATH = "xpath://*[@id=\"checkout_complete_container\"]/h2";
    public static final String MENSAJE_ERROR_CHECKOUT_XPATH = "xpath://*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3";
}
