
enum TipoPizza {        // colecao de valores fixos para cada valor - coleção de constantes
    CALABRESA(1), QUATRO_QUEIJOS(2), CANGACEIRA(4), PORTUGUESA(3);

    private Integer id;     //integer é a classe nao primitiva do int,
    private TipoPizza(Integer id){
        this.id= id;
    }

    public Integer getId(){
        return id;
    }

    public TipoPizza getTipo(Integer pId){
        for(TipoPizza p: TipoPizza.values()){       // p é uma variavel declarada do tipo TipoPizza. for para coleções, ou seja, passa por toda a coleção TipoPizza. Enquanto houver valores
            if(pId.equals(p.getId())){      //se forem iguais, o tipo de pizza existe, logo, pode ser criada
                return p;
            }
        }
        throw new RuntimeException("Tipo inválido: " + pId);
    }

}
