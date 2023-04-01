import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.Aluno;
import domain.Departamento;
import domain.Professor;
import domain.Universidade;


public class App {
    
    public static void main(String[] args) throws Exception {
    /*    
    Curso curso = new Curso("DSM", Arrays.asList("CI/CD", "TDD", "UX/UI"));

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria"); 
        Aluno a3 = new Aluno("José");

        List<Aluno> alunos = Arrays.asList(a1,a2,a3);

        Professor professor = new Professor(alunos); //professor e alunos= dependencia
        professor.ensina(curso);
        
*/

        List<Professor> lista = new ArrayList<>();
        lista.add(new Professor("Caroline"));
        lista.add(new Professor("Thainá"));

    //settando usando o padrão builder
        Departamento deptoTI = new Departamento("Departamento de Tecnologia da Informação") //colocar os setters com builds logo em seguida, um seguido do outro, sem ponto e virgula
        .setEmail("depti@fatec.sp.gov.br")
        .setProfessores(lista);   

        Universidade fatec = new Universidade();
        fatec.criarDepartamento(deptoTI);   //vai passar o departamento que ja foi instanciado
        fatec.listarDepartamentos();

        deptoTI.criarProfessor();   //criar o professor no departamento de TI -> instanciando dentro da classe Professor (ver Professor)
        
        fatec.listarDepartamentos();
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Val"));
        alunos.add(new Aluno("Luiza"));
        alunos.add(new Aluno ("Thaina"));

        deptoTI.getProfessores().get(0).setAlunos(alunos);
        deptoTI.getProfessores().get(1).setAlunos(alunos);

        fatec.listarDepartamentos();
    
       


    }

}
