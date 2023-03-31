package domain;


import java.util.ArrayList;
import java.util.List;

//relacionamento de COMPOSIÇÃO com DEPARTAMENTO

public class Universidade {
    
    private List<Departamento> departamentos = new ArrayList<>();  //inicializando lista //composta pela classe departamentos
    //depende exclusivamento dos departamento e vai gerir

    //metodos em UNIVERSIDADE que gerenciam DEPARTAMENTOS

    public void criarDepartamento(Departamento departamento){
        this.departamentos.add(departamento);   //adicionando na lista de departamentos
    }

    public void excluirDepartamento(Departamento departamento){
        this.departamentos.remove(departamento);    // removendo da lista de departamentoss
    }

    public void listarDepartamentos(){
        System.out.println("Departamentos \n");
        this.departamentos.forEach(d -> {
            System.out.println(d);
        });
        System.out.println("\n ------------------------------------");;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Universidade [departamentos=" + departamentos + "]";
    }

    
}
