import java.util.List;

public abstract class Pizza {
    // atributos gerais
    private String nome;
    private double valor;
    protected List<String> ingredientes; //lista de ingredientes

    //construto de classe

    //criando o padrão de construcao de todas as pizzas
    public Pizza(String nome, double valor, List<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    // metodos getDescricao, que vai ser utilizado para mostrar a descricao de cada pizza
    public String getDescricao(){
        return this.getClass().getSimpleName() + //pega o nome da classe
            "{" + "valor: " + valor +
            ", nome: " +  nome +
            ", ingredientes: " + ingredientes + "}";
    }

}
