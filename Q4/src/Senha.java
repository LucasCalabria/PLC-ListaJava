public class Senha {
    protected String num;
    protected String alf_num;

    protected Senha(String num,  String alf_num){
        this.num = num;
        this.alf_num = alf_num;
    }

    protected String get_num(){
        return this.num;
    }
    protected String get_alf_num(){
        return this.alf_num;
    }

    protected void set_num(String num){
        this.num = num;
    }
    protected void set_alf_num(String alf_num){
        this.alf_num = alf_num;
    }
}
