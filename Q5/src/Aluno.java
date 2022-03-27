public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(){
        this.set_name("");
        this.set_cpf("");
        this.matricula = "";
        this.curso = "";
    }
    public Aluno(String name, String cpf, String matricula, String curso){
        this.set_name(name);
        this.set_cpf(cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String get_matricula(){
        return this.matricula;
    }
    public String get_curso(){
        return this.curso;
    }

    public void set_name(String name){
        this.name = name;
    }
    public void set_cpf(String cpf){
        this.cpf = cpf;
    }
    public void set_formacao(String matricula){
        this.matricula = matricula;
    }
    public void set_curso(String curso){
        this.curso = curso;
    }
}
