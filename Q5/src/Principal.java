public class Principal {
    public static void main(String[] args) throws Exception{
        String txt   = "Vagas Restantes: ";
        ColecaoVetor vet = new ColecaoVetor();
        Aluno aluno0 = new Aluno("Dudoncio", "123456789", "123456" , "Engenharia");
        Aluno aluno1 = new Aluno("Zeze Bolagude", "987654312", "254786", "Educacao Fisica");
        Professor p  = new Professor("Rodolfo D'screta", "123556651", "Matematica", "Matematica Discreta");

        vet.inserir(aluno0);
        System.out.println(txt + (5-vet.tamanhoColecaoNaoNull()));

        vet.inserir(aluno1);
        System.out.println(txt + (5-vet.tamanhoColecaoNaoNull()));

        vet.inserir(p);
        System.out.println(txt + (5-vet.tamanhoColecaoNaoNull()));

        System.out.println("------------------------------");

        vet.full_list();
    }
}
