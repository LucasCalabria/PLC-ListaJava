public class Professor extends Pessoa {
    private String formacao;
    private String area;

    public Professor(){
        this.set_name("");
        this.set_cpf("");
        this.formacao = "";
        this.cpf = "";
    }
    public Professor(String name, String cpf, String formacao, String area){
        this.set_name(name);
        this.set_cpf(cpf);
        this.formacao = formacao;
        this.cpf = area;
    }

    public String get_formacao(){
        return this.formacao;
    }
    public String get_area(){
        return this.area;
    }

    public void set_name(String name){
        this.name = name;
    }
    public void set_cpf(String cpf){
        this.cpf = cpf;
    }
    public void set_formacao(String formacao){
        this.formacao = formacao;
    }
    public void set_area(String area){
        this.area = area;
    }
}
