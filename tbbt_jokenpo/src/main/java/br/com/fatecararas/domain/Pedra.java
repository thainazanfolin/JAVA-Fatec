package br.com.fatecararas.domain;

import java.util.Map;

public class Pedra extends Algoritmo{

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Ganhou! Papel embrulha pedra!";
            case TESOURA -> valor = "Perdeu! Pedra esmaga tesoura!";
            case PEDRA -> valor = "Empate. Papel empata com papel!";
            case LAGARTO -> valor = "Ganhou! Lagarto come o papel!";
            case SPOCK -> valor = "Ganhou! Papel refuta o Spock!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }

}