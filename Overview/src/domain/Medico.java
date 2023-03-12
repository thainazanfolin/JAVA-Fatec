package domain;

import java.time.LocalDate;

public abstract class Medico extends Funcionario {

    private Integer crm;
    public Medico(String nome, String email, String telefone, Long matricula, LocalDate dataAdmissao, Integer crm) {
        super(nome, email, telefone, matricula, dataAdmissao);
        this.crm = crm;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public abstract void executarProcedimento(Paciente paciente) throws Exception;    // deixando abstrato, todos os concretos que extendem o medico precisam implementar seus proprios metodos procedimento

    /* COMO SE TORNOU ABSTRATO, NAO PRECISA IMPLEMENTAR
    @Override
    public String getInformacao() {
        return String.format("Nome:  %s\nEmail: %s\nTel: %s\nRegistro: %s\nData de admissão: %s\nCRM: %s", this.getNome(), this.getEmail(), this.getTelefone(), this.getMatricula(), this.getDataAdmissao(), this.getCrm()); // usando get pois está encapsulado
    }
   */

}
