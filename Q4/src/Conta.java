public class Conta {
    protected int id;
    protected int ag;
    protected Senha password;

    protected Conta(int id, int ag, Senha password){
        this.id = id;
        this.ag = ag;
        this.password = password;
    }

    protected int get_id(){
        return this.id;
    }
    protected int get_ag(){
        return this.ag;
    }
    protected Senha get_password(){
        return this.password;
    }

    protected void set_id(int id){
        this.id = id;
    }
    protected void set_ag(int ag){
        this.ag = ag;
    }
    protected void set_password(Senha password){
        this.password = password;
    }

    protected void show_password(){
        System.out.println("Numerical Password:    " + this.get_password().get_num());
        System.out.println("Alphanumeric Password: " + this.get_password().get_alf_num());
    }
}
