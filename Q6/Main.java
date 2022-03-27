public class Main {
    public static void main(String[] args) throws Exception{
        String expr = "2*3+4/6";
        char[] ch = ExprAritmetica.ops(expr);

        for(int i =0; i<ch.length; i++){
            System.out.println(ch[i]);
        }
        
    }
}
