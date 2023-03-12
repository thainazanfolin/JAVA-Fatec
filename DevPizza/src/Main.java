import java.util.Scanner;

public class Main {     //CLIENT
    public static void main(String[] args) {
        //o cliente executa a logica para selecionar o tipo de pizza
        Scanner in = new Scanner(System.in);
        Pizzaria pizzaria = new Pizzaria();

        //possibilidade de fazer um menu
        System.out.println("MENU");
        System.out.println("1. Calabresa");
        System.out.println("2. Quatro Queijos");
        System.out.println("3. Portuguesa");
        System.out.println("4. Cangaceira");

        //faz a leitura do que o usuaruo digitou
        int idPizza = in.nextInt();

        //converter o valor da entrada em um tipo de enum TipoPizza -> usando o metodo da classe TipoPizza
        TipoPizza tipo = TipoPizza.getTipo(idPizza);

        pizzaria.criarPizza(tipo); //o criar pizza depende que vc passe um parametro enum para a criacao, nesse caso, será o que o usuario escolher
        //passa o tipo -> identifica o tipo do enum -> cria o objeto dentro da classe TipoPizza -> passa para a Factory () que usa os construtores das classes ds pizzas para criar os objetos
        pizzaria.entregar();

        in.close(); //fechando scanner
    }
}