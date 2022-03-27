public class Main {
    public static void main(String[] args) throws Exception{
        Senha password = new Senha("09876", "asdf123");
        Conta account = new Conta(12345, 12, password);

        account.show_password();

        System.out.println("------------------------------------");
        password.set_alf_num("789FGH");
        account.set_password(password);

        account.show_password();
    }
}
