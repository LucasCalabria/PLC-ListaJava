abstract class Livro {
    private String title;
    private String author;
    private String genre;
    private int num_pag;

    public void set_title(String title){
        this.title = title;
    }
    public void set_author(String author){
        this.author = author;
    }
    public void set_genre(String genre){
        this.genre = genre;
    }
    public void set_num_pag(int num_pag){
        this.num_pag = num_pag;
    }

    public String get_title(){
        return title;
    }
    public String get_author(){
        return author;
    }
    public String get_genre(){
        return genre;
    }
    public int get_num_pag(){
        return num_pag;
    }

    public void print_aux(){
        System.out.println("Title:  " + this.get_title ());
        System.out.println("Author: " + this.get_author());
        System.out.println("Genre:  " + this.get_genre ());
        System.out.println("Number of Pages: " + this.get_num_pag());
    }
} 