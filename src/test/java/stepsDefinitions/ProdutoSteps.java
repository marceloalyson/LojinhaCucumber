package stepsDefinitions;

import base.BaseUtil;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class ProdutoSteps extends BaseUtil {

    private String produtoNome;
    private double produtoValor;
    private String produtoCores;
    private String produtoUrlMock;
    private String componenteNome;
    private int componenteQuantidade;
    private BaseUtil base;

    public ProdutoSteps(BaseUtil base) {
        this.base = base;
    }

    public ProdutoSteps() {

    }

    @Dado("que tenho possuo um produto")
    public void que_tenho_possuo_um_produto() {
        setupBodyRequestProduto(
                "{\n" +
                        "  \"produtoNome\": \"Jogo de Mesa\",\n" +
                        "  \"produtoValor\": 899.00,\n" +
                        "  \"produtoCores\": [\n" +
                        "    \"Vinho\"\n" +
                        "  ],\n" +
                        "  \"produtoUrlMock\": \"www.vendasbrasil.com.br\",\n" +
                        "  \"componentes\": [\n" +
                        "    {\n" +
                        "      \"componenteNome\": \"cadeiras\",\n" +
                        "      \"componenteQuantidade\": 6\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}");
    }
    @Quando("envio as informacoes do produto")
    public void envio_as_informacoes_do_produto() {
         sendPostProduto("/produtos");
    }
    @Entao("o produto e salvo com sucesso")
    public void o_produto_e_salvo_com_sucesso() {

        Assert.assertEquals(401, getResponse().getStatusCode());

        }
}
