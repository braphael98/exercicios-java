public class Aula02 {
    public static void main(String[] args) {
        Pernilongo jorge = new Pernilongo();
        jorge.atrapalharSono();

    }
}

class Pernilongo {
    String barulho = "piiiii";

    public void atrapalharSono() {
        System.out.println(this.barulho);
    }
}
