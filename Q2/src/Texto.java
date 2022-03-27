import java.util.regex.Pattern;

public class Texto{
    private String txt;

    public Texto(String txt){
        this.txt = txt;
    }

    public void set_txt(String txt){
        this.txt = txt;
    }
    public String get_txt(){
        return this.txt;
    }

    public void print_txt(){
        System.out.println(this.get_txt());
    }

    public void replace_txt(String txt, String subs){
        this.set_txt(this.get_txt().replaceAll(txt, subs));
    }

    public int freq_txt(String txt){
        String str = this.get_txt();
        int aux = str.indexOf(txt);
        int n = 0;

        while (aux != -1){
            n++;
            str = str.substring(aux + 1);
            aux = str.indexOf(txt);
        }

        return n;
    }

    public int tot_txt(){
        String aux   = " !?.,";
        String txt[] = this.get_txt().split("[" + Pattern.quote(aux) + "]+");

        return txt.length;
    }
}