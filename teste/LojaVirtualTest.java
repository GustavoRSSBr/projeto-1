package com.ada.teste;

import com.ada.loja.Carrinho;
import com.ada.loja.LojaVirtual;
import com.ada.loja.Produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LojaVirtualTest {

    @Test
    public void criarProdutoRetornaProduto() {
        LojaVirtual loja = new LojaVirtual();
        Produto produto = loja.criarProduto();
        Assertions.assertNotNull(produto);
        Assertions.assertEquals("mouse", produto.getNome());
        Assertions.assertEquals(50D, produto.getPreco());
    }

    @Test
    public void criarCarrinhoRetornaCarrinhoVazio() {
        LojaVirtual loja = new LojaVirtual();
        Carrinho carrinho = loja.criarCarrinho();
        Assertions.assertTrue(carrinho.isVazio());
        Assertions.assertEquals(0, carrinho.getQtde());
    }

    @Test
    public void adicionarAoCarrinhoAdicionaProduto() {
        LojaVirtual loja = new LojaVirtual();
        Carrinho carrinho = loja.criarCarrinho();
        Produto produto = loja.criarProduto();
        loja.adicionarAoCarrinho(produto);
        Assertions.assertFalse(carrinho.isVazio());
        Assertions.assertEquals(1, carrinho.getQtde());
    }
}
