
public class Main {

    var pizzaria = new Pizzaria();
    pizzaria.criarPizza(TipoPizza); 
    //passa o tipo -> identifica o tipo do enum -> cria o objeto dentro da classe TipoPizza -> passa para a Factory () que usa os construtores das classes ds pizzas para criar os objetos
    pizzaria.entregar();


}