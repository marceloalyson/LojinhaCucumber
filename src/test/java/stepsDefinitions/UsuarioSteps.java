package stepsDefinitions;


import base.BaseUtil;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;


import org.junit.Assert;

public class UsuarioSteps extends BaseUtil {

    private String usuarioLogin;
    private String usuarioSenha;
    private BaseUtil base;

    public UsuarioSteps(BaseUtil base) {
        this.base = base;
    }

    public UsuarioSteps() {

    }

    @Dado("que preciso fazer login")
    public void que_preciso_fazer_login() {
        setupBodyRequest("{\n" +
                " \"usuarioLogin\": \"admin\", \n" +
                " \"usuarioSenha\": \"admin\"\n" +
                "}");
    }
    @Quando("insiro as credenciais")
    public void insiro_as_credenciais() {
        sendPost("/login");
    }
    @Entao("o login deve ser realizado")
    public void o_login_deve_ser_realizado() {
        Assert.assertEquals(200, getResponse().getStatusCode());

    }


}
