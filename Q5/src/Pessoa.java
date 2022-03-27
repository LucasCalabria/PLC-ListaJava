abstract class Pessoa {
    protected String name;
    protected String cpf;

    protected Pessoa(){
        this.name = "";
        this.cpf  = "";
    }
    protected Pessoa(String name, String cpf){
        this.name = name;
        this.cpf  = cpf;
    }

    protected String get_name(){
        return this.name;
    }
    protected String get_cpf(){
        return this.cpf;
    }

    protected abstract void set_name(String name);
    protected abstract void set_cpf(String cpf);

}
