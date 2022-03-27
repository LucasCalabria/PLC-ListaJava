public class Main {
    public static void main(String[] args) throws Exception {
        int n = 1;

        LivroLivraria[] str = new LivroLivraria[n];
        str[0] = new LivroLivraria("Game of Thrones", "George Martin", "Fantasy", 694, 100, 70);
        str[0].sell(20);
        str[0].restock(10);

        str[0].print_ov();

        System.out.println("----------------------------------");

        LivroBiblioteca[] lib = new LivroBiblioteca[n];
        lib[0] = new LivroBiblioteca("Game of Thrones", "George Martin", "Fantasy", 694);
        lib[0].borrow("Lucas Calabria");
        lib[0].print_ov();
    }
}
