package domain;

import java.time.LocalDate;
import java.util.Random;

public class Pediatra extends Medico implements Contrato {

    private String hospitalRes;

    public String getHospitalRes() {
        return hospitalRes;
    }

    public void setHospitalRes(String hospitalRes) {
        this.hospitalRes = hospitalRes;
    }

    public Pediatra(String nome, String email, String telefone, Long matricula, LocalDate dataAdmissao, Integer crm, String hospitalRes) {
        super(nome, email, telefone, matricula, dataAdmissao, crm);
        this.hospitalRes = hospitalRes;
    }

    @Override
    public String getInformacao() {
        return String.format("Nome:  %s\nEmail: %s\nTel: %s\nRegistro: %s\nData de admissão: %s\n \n", getNome(), getEmail(), getTelefone(), getMatricula(), getDataAdmissao(), getHospitalRes()); // usando get pois está encapsulado
    }

    @Override
    public void executarProcedimento(Paciente paciente) throws Exception {
        System.out.printf("Atendendo %s", paciente.getNome());  // printf permite formatação; print imprime sem a quebra de linha; println imprime com a quebra de linha.
        System.out.println("Medindo a temperatura");
        Thread.sleep(3000); // Thread.sleep() method can be used to pause the execution of the current thread for a specified time in milliseconds.
        System.out.printf("Temperatura: %s", new Random().nextInt(40));
        vacinar(paciente);
    }

    @Override
    public void vacinar(Paciente paciente) {
        System.out.printf("Aplicando vacina em %s", paciente.getNome());  // printf permite formatação; print imprime sem a quebra de linha; println imprime com a quebra de linha.
    }
}
