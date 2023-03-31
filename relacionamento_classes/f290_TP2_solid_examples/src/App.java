
import java.util.Arrays;
import java.util.List;

import domain.Aluno;
import domain.Curso;
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

    //settando usando o padrão builder
        Departamento deptoTI = new Departamento("Departamento de Tecnologia da Informação") //colocar os setters com builds logo em seguida, um seguido do outro, sem ponto e virgula
        .setEmail("depti@fatec.sp.gov.br")
        .setProfessores(Arrays.asList(  //pode criar a lista antes ou AQUI (como feito abaixo)
            new Professor("Caroline"),  //instanciando professores
            new Professor("Daniel")
            )
        );   

        Universidade fatec = new Universidade();
        fatec.criarDepartamento(deptoTI);   //vai passar o departamento que ja foi instanciado
        fatec.listarDepartamentos();
        
        

    
       


    }

}
