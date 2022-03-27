public class ColecaoVetor implements Colecao {
    private Pessoa[] dados = new Pessoa[5];
    private int n;

    public ColecaoVetor( ){
        this.n = 0;
    }

    public Pessoa[] get_dados(){
        return this.dados;
    }

    public void inserir(Pessoa p){
        this.dados[n] = p;
        n++;
    }

    public int tamanhoColecaoNaoNull(){
        return n;
    }

    public void full_list(){
        for (int i = 0; i < this.n; i++){
            System.out.println(this.dados[i].get_name());
        }
    }
}