import java.util.regex.Pattern;

public class ExprAritmetica implements Expression {
    public void avaliar(String expr){
        String nums = nums(expr);
        char[] ops  = ops(expr);

    }

    public void imprimirArvore(String expr){

    }

    public String toString(){

    }

    private static String[] nums(String expr){
        String aux   = "+-*/";
        String txt[] = expr.split("[" + Pattern.quote(aux) + "]+");

        return txt;
    }

    private static char[] ops(String expr){
        int n = 1;
        char[] vet = {};

        for (int i =0; i<expr.length(); i++){
            char ch = expr.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                char[] aux = new char[n];
                for(int j=0; j<vet.length; j++){
                    aux[j] = vet[j];
                }
                aux[n-1] = ch;
                vet = aux;
                n++;
            }
        }
        return vet;
    }    
}