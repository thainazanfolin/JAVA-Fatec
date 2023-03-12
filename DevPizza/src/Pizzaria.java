public class Pizzaria {     //CONTEXTO: quem cria as pizzas

   public Pizza pizza = null;

    public void criarPizza(TipoPizza tipo){     //cria a pizza
        //usando o factory para criar as pizzas - criando um objeto

        var factory = new PizzaFactory(); //instancia o objeto da classe PizzaFactory - que tem o swtich case + o objeto criado
        var pizza = factory.criarPizza(tipo);   // variavel criada nesse contexto recebe o objeto criado de acordo com a classe PizzaFactory
    }

    public void entregar(){
        System.out.println(pizza.getDescricao());
    }


}
