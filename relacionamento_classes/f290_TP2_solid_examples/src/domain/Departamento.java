package domain;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    

    private String nome;
    private List<Professor> professores; // -> composição
    private String email;


    public void criarProfessor(Professor professor){
        this.professores.add(professor);   //adicionando na lista de professores 
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
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Departamento(String nome) {
        this.nome = nome;
    
    }
    
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", professores=" + professores + ", email=" + email + "]";
    }

    
    

}
