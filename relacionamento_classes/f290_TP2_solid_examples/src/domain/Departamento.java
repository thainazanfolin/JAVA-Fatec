public class Departamento {
    

    private String nome;
    private List<Professor> professores;
    private String email;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Departamento(String nome) {
        this.nome = nome;
    
    }
    
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", professores=" + professores + ", email=" + email + "]";
    }

    
    

}
