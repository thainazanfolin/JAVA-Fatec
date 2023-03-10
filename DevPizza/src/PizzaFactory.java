import java.lang.reflect.Array;
import java.util.Arrays;

public class PizzaFactory { //regra de negocio dentro da factory

    public Pizza criarPizza(TipoPizza tipo){     //vai retornar uma Pizza de acordo com o parametro tipoPizza, que é outra classe
        Pizza pizza = null;

        // fazendo na Factory, nao precisa alterar nas classes das pizzas, apenas aqui
        switch (tipo){      // informa o tipo e ele retorna um objeto criado de acordo com as outras classes
            case CALABRESA -> pizza = new Calabresa("Calabresa", 50D, Arrays.asList("Molho de Tomate", "Calabresa", "Cebola", "Orégano"));
            case CANGACEIRA -> pizza = new Cangaceira("Cangaceira", 45D, Arrays.asList("Molho de Tomate", "Carne Seca", "Cebola"));
            case PORTUGUESA -> pizza = new Portuguesa("Portuguesa", 50D, Arrays.asList("Molho de Tomate", "Queijo Mussarela"));
            case QUATRO_QUEIJOS -> pizza = new QuatroQueijos("Quatro Queijos", 50D, Arrays.asList("Queijo Mussarela", "Queijo Gorgonzola", "Queijo Parmesão", "Queijo Gouda"));
            default -> throw new AssertionError();  //teste
        }

    }

}

