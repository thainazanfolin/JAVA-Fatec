import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.Aluno;
import domain.Curso;
import domain.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        
    Curso curso = new Curso("DSM", Arrays.asList("CI/CD", "TDD", "UX/UI"));

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria"); 
        Aluno a3 = new Aluno("José");

        List<Aluno> alunos = Arrays.asList(a1,a2,a3);

        Professor professor = new Professor(alunos); //professor e alunos= dependencia
        professor.ensina(curso);

        

    }
}
