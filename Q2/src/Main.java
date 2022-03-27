public class Main {
    public static void main(String[] args) throws Exception{
        Texto txt = new Texto("asd,ghj. asd asy  asj");

        txt.print_txt();
        txt.replace_txt("asd", "ASD");
        txt.print_txt();

        System.out.println(txt.freq_txt("ASD") + " " + txt.tot_txt());

    }
}
