package domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Departamento {
    

    private String nome;
    private List<Professor> professores = new ArrayList<>(); // -> composição
    private String email;


    public void criarProfessor(){   //em vez de passar o objeto ja instanciado na classe Professor, instancia o objeto aqui
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do professor");
        String nome = in.nextLine();
        var professor = new Professor(nome);    //instancia o objeto de acordo com o que foi lido
        this.professores.add(professor);   //adicionando na lista de professores 
        in.close();
    }

    public void excluirProfessor(Professor professor){
        this.professores.remove(professor);    // removendo da lista de departamentoss
    }

    public void listarProfessores(){
        System.out.println("Professores: \n");
        this.professores.forEach(d -> {
            System.out.println(d);
        });
        System.out.println("\n ------------------------------------");;
    }
    

    public String getNome() {
        return nome;
    }
    public Departamento setNome(String nome) {  //padrao builder: criar o objeto e chamar varios SETTERS encadeados (ver no app.java)
        this.nome = nome;
        return this;    //retorna a propria classe
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public Departamento setProfessores(List<Professor> professores) {
        this.professores = professores;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public Departamento setEmail(String email) {
        this.email = email;
        return this;
    }
    public Departamento(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", professores=" + professores + ", email=" + email + "]";
    }

    
    

}
