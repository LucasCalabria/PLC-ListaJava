public class Main {
    public static void main(String[] args) throws Exception{
        Person person0 = new Person();
        Person person1 = new Person("Lucas Calabria", 23, "superior incomplete" ,Gender.CISGENDER,"hetero", "Male");
        
        person0.set_name("Lucas Calabria");
        person0.sleep();
        
        person1.set_name("Lucas Cavalcanti");
        person1.work();
    }
}
