package domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    
    private List<String> conhecimento = new ArrayList<>();

    

    public Curso(String nome, List<String> conhecimento) {
        this.nome = nome;
        this.conhecimento = conhecimento;
    }

    public List<String> getConhecimentos() {
        return conhecimento;
    }

    public void setConhecimentos(List<String> conhecimento) {
        this.conhecimento = conhecimento;
    }

    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", conhecimento=" + conhecimento + "]";
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

    public void setConhecimento(List<String> conhecimento) {
        this.conhecimento = conhecimento;
    }

    
}
