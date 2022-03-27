public class Person {
    protected int age;
    protected String name;
    protected String lvl;
    protected String ori;
    protected String bio;
    protected Gender gender;

    public Person(){
        this.age = -1;
        this.name = "";
        this.lvl  = "";
        this.ori = "";
        this.bio = "";
        this.gender = Gender.NULL;
    }

    public Person(String name, int age, String lvl, Gender gender, String ori, String bio){
        this.age = age;
        this.name = name;
        this.lvl  = lvl;
        this.gender = gender;
        this.ori = ori;
        this.bio = bio;
    }

    public int get_age(){
        return this.age;
    }
    public String get_name(){
        return this.name;
    }
    public String get_lvl(){
        return this.lvl;
    }
    public Gender get_gender(){
        return this.gender;
    }
    public String get_ori(){
        return this.ori;
    }
    public String get_bio(){
        return this.bio;
    }

    public void set_age(int age){
        this.age = age;
    }
    public void set_name(String name){
        this.name = name;
    }
    public void set_lvl(String lvl){
        this.lvl = lvl;
    }

    public void sleep(){
        System.out.println(this.get_name() + " slept");
    }
    public void shit(){
        System.out.println(this.get_name() + " relieved themselves");
    }
    public void eat(){
        System.out.println(this.get_name() + " ate");
    }
    public void study(){
        System.out.println(this.get_name() + " studied");
    }
    public void live(){
        System.out.println(this.get_name() + " lived");
    }
    public void survive(){
        System.out.println(this.get_name() + " survived");
    }
    public void work(){
        System.out.println(this.get_name() + " worked");
    }
}