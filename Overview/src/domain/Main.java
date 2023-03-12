package domain;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

    // var p1 = new Pessoa("Victor Hugo", "victorhugo@email.com", "198564325");

    //para mostrar os atributos, é possível usar a função toString, que é presente automaticamente em todas as classes

    Pediatra pediatra1 = new Pediatra("Marcos Paulo", "marcospaulo@email.com", "1995848236", 1524369L, LocalDate.of(2022, 12, 05) , 1554555, "Hospital das Clínicas");
    Paciente paciente1 = new Paciente("Debora", "debora@email.com", "1985472653");

    pediatra1.executarProcedimento(paciente1);
    }
}