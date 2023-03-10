
public class Main {     //CLIENT
    //o cliente executa a logica para selecionar o tipo de pizza

    //possibilidade de fazer um menu

    var pizzaria = new Pizzaria();
    pizzaria.criarPizza(TipoPizza);
    //passa o tipo -> identifica o tipo do enum -> cria o objeto dentro da classe TipoPizza -> passa para a Factory () que usa os construtores das classes ds pizzas para criar os objetos
    pizzaria.entregar();


}