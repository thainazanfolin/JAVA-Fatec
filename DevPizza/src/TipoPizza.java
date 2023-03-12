
enum TipoPizza {        // colecao de valores fixos para cada valor - coleção de constantes
    CALABRESA(1), QUATRO_QUEIJOS(2), CANGACEIRA(4), PORTUGUESA(3);

    private Integer id;     //integer é a classe nao primitiva do int, permite uso de outras funçoes
    private TipoPizza(Integer id){
        this.id= id;
    }

    public Integer getId(){
        return id;
    }

    public static TipoPizza getTipo(Integer pId){       //esse metodo faz o reconhecimento entre o que o usuario passou e os enums criados nesse classe. Se o id passado for igual a um que existe, retorna uma variavel do tipo enum, que será passado pelo factoru
        for(TipoPizza p: TipoPizza.values()){       // p é uma variavel declarada do tipo TipoPizza. for para coleções, ou seja, passa por toda a coleção TipoPizza. Enquanto houver valores
            if(pId.equals(p.getId())){      //se o ID passado pelo cliente for igual ao ENUM, o tipo de pizza existe, logo, pode ser criada
                return p;       // retorna o TIPO DA PIZZA -> que vai passar para a Factory _> criarpizza() -> pizza criada
            }
        }
        throw new RuntimeException("Tipo inválido: " + pId);
    }

}
