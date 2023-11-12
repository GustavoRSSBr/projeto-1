package com.ada.teste;

import com.ada.loja.Produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    public void criacaoDeProdutoComParametrosValidos() {
        int cod = 123;
        String nome = "Camiseta";
        double preco = 50.00;

        Produto produto = new Produto(cod, nome, preco);

        Assertions.assertEquals(cod, produto.getCod());
        Assertions.assertEquals(nome, produto.getNome());
        Assertions.assertEquals(preco, produto.getPreco());
    }

    @Test
    public void alterarNomeDoProduto() {
        Produto produto = new Produto(123, "Camiseta", 50.00);
        String novoNome = "Calça";
        produto.setNome(novoNome);
        Assertions.assertEquals(novoNome, produto.getNome());
    }

    @Test
    public void alterarPrecoDoProduto() {
        Produto produto = new Produto(123, "Camiseta", 50.00);
        double novoPreco = 70.00;
        produto.setPreco(novoPreco);
        Assertions.assertEquals(novoPreco, produto.getPreco());
    }
}
