#language: pt

Funcionalidade: Cadastrar Produto
  @SmokeTest
   Cenario: Realizar cadastro de Produto na lojinha API
    Dado que tenho possuo um produto
    Quando envio as informacoes do produto
    Entao o produto e salvo com sucesso