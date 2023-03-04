package calculadora1;

import java.util.Scanner;

public class Calculadora1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //usando funcao scanner para ler do console

        int funcao;

        System.out.println("ESCOLHA A OPERAÇÃO");
        System.out.println("1-SOMAR");
        System.out.println("2-SUBTRAÇÃO");
        System.out.println("3-MULTIPLICAÇÃO");
        System.out.println("4-DIVISÃO");

        funcao = sc.nextInt();

        switch (funcao) {

            case 1:   //chamar funcao soma

                Funcoes.soma();
                //a variavel local soma recebe o return da funcao soma dentro da class Funcoes, que na main está com f; 

                break;

            case 2:
                //chamar funcao subtração

                Funcoes.subtracao();

                break;

            case 3:
                //chamar multiplicação

               Funcoes.multiplicacao();

                break;

            case 4:
                //chamar divisao

                Funcoes.divisao();

                break;

        }

    }

}
