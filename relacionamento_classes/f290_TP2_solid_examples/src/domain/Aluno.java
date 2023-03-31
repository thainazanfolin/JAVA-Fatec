package domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<String> conhecimento = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, List<String> conhecimento) {
        this.nome = nome;
        this.conhecimento = conhecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getConhecimento() {
        return conhecimento;
    }

    public void assimilar(List<String> conhecimento) {
        this.conhecimento.addAll(conhecimento);
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", conhecimento=" + conhecimento + "]";
    }
}