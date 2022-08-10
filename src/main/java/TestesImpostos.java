import imposto.CalculadoraDeImpostos;
import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos
{
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.calcular(orcamento, TipoImposto.ISS);

    }
}
