package domain;

import java.time.LocalDate;
import java.util.List;

public class Programador extends Funcionario {

    private String github;
    private List<String> stack; // nao precisa necessariamente criar outro atributo, pode apenas extender de outra
    public Programador(String nome, String email, String telefone, Long matricula, LocalDate dataAdmissao, String github, List<String> stack) {
        super(nome, email, telefone, matricula, dataAdmissao);
        this.github = github;
        this.stack = stack;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }

    @Override
    public String getInformacao() {
        return String.format("Nome:  %s\nEmail: %s\nTel: %s\nRegistro: %s\nData de admissão: %s\n Stack: %s\n\n", this.getNome(), this.getEmail(), this.getTelefone(), this.getMatricula(), this.getDataAdmissao(), this.getGithub(), this.getStack()); // usando get pois está encapsulado
    }




}
