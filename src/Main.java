public class Main {
    public static void main(String[] args) {
        Tekst tekst = new Tekst();

        tekst.tilføj("bob");
        tekst.tilføj("jesus");
        tekst.tilføj("sda");
        tekst.tilføj("bob");

        for(String s : tekst.getTekstLinjer()){
            System.out.println(s);
        }

        System.out.println(tekst.findAntalUnikke());
    }
}
