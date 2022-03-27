public class LivroLivraria extends Livro {
    private int stock;
    private float price;

    public LivroLivraria(String title, String author, String genre, int num_pag, int stock, float price){
        this.set_title(title);
        this.set_author(author);
        this.set_genre(genre);
        this.set_num_pag(num_pag);
        this.stock = stock;
        this.price = price;
    }

    public void set_stock(int stock){
        this.stock = stock;
    }
    public void set_price(float price){
        this.price = price;
    }

    public int get_stock(){
        return this.stock;
    }
    public float get_price(){
        return this.price;
    }

    public double sell(int num){
        this.set_stock(this.get_stock() - num);
        return num * (this.get_price()); //retorna o preco total da venda
    }
    public void restock(int num){
        this.set_stock(this.get_stock() + num);
    }

    public void print_ov(){
        this.print_aux();
        System.out.println("Current in Stock: " + this.get_stock());
        System.out.println("Price: " + this.get_price()); 
    }
}