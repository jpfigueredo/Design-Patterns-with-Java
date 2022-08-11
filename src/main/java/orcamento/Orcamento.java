package orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private String situacao;


    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDeDescontoExtra = BigDecimal.ZERO;
        if (situacao.equals("EM ANALISE")) {
            valorDeDescontoExtra = new BigDecimal("0.05");
        } else if(situacao.equals("APROVADO")){
            valorDeDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDeDescontoExtra);
    }

    public void aprovar(){
        this.situacao = "APROVADO";
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
