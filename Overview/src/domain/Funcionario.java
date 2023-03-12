package domain;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {
    private Long matricula;
    private LocalDate dataAdmissao;

    //construtor proprio
    public Funcionario(String nome, String email, String telefone, Long matricula, LocalDate dataAdmissao) {
        super(nome, email, telefone);   //repassar o valor para a classe pai Pessoa
        this.matricula = matricula;   // quando está dentro da propria classe, nao precisa usar o set
        this.dataAdmissao = dataAdmissao;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }




}
