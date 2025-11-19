package lippia.web.services;


import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LoginConstants;

public class LoginService extends WebActionManager {
    public static void navePage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));

    }
    public static void ingresarUsuario(String pUser){
        setInput(LoginConstants.CAMPO_USUARIO_XPATH, pUser );
    }
    public static void ingresarPassword(String pPass){
        setInput(LoginConstants.CAMPO_PASSWORD_XPATH, pPass);
    }
    public static void clickBotonLogin(){
        click(LoginConstants.BOTON_LOGIN_XPATH);
    }
    public static void verificarLogueoExitoso(){
        Assert.assertTrue("El usuario no se loguea exitosamente", waitPresence(LoginConstants.TITULO_INVENTARIO_XPATH).isDisplayed());
    }
    public static void verificarLogueoFallido(String errorMsj){
        Assert.assertEquals("No se visualiza la leyenda de usuario bloqueado", errorMsj, getElement(LoginConstants.MSJ_USUARIO_BLOQUEADO_XPATH).getText());
    }
}
