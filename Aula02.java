public class Aula02 {
    public static void main(String[] args) {
        Pernilongo jorge = new Pernilongo();
        jorge.atrapalharSono();
        Cachorro getulio = new Cachorro();
        getulio.atrapalharSono();
        Pernilongo mari = new Pernilongo();
        mari.atrapalharSono();
        Pernilongo altair = new Pernilongo();
        altair.atrapalharSono();
        Pernilongo joyce = new Pernilongo();
        joyce.atrapalharSono();

    }
}

class Pernilongo {
    String barulho = "piiiii";

    public void atrapalharSono() {
        System.out.println(this.barulho);
    }
}

class Cachorro {
    String barulho = "Au au";

    public void atrapalharSono() {
        System.out.println(this.barulho);
    }
}
