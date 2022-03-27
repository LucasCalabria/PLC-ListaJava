public class LivroBiblioteca extends Livro {
    private Boolean borrowed;
    private String  name;

    public LivroBiblioteca(String title, String author, String genre, int num_pag){
        this.set_title(title);
        this.set_author(author);
        this.set_genre(genre);
        this.set_num_pag(num_pag);
        this.borrowed = false; //Se considera inicialmente que o livro nao foi emprestado
        this.name = ""; 
    }

    public void set_borrowed(Boolean borrowed){
        this.borrowed = borrowed;
    }
    public void set_name(String name){
        this.name = name;
    }

    public Boolean get_borrowed(){
        return this.borrowed;
    }
    public String get_name(){
        return this.name;
    }

    public void borrow(String name){
        this.set_borrowed(true);
        this.set_name(name);
    }
    public void return_book(){
        this.set_borrowed(false);
        this.set_name("");
    }

    public void print_ov(){
        this.print_aux();
        if (this.get_borrowed()) {
            System.out.println("Book Loaned to: " + this.get_name());
        }
        else {
            System.out.println("Book not Loaned");
        }; 
    }
}
