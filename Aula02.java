public class Aula02 {
    public static void main(String[] args) {
        Animal jorge = new Animal("au au au au");
        jorge.atraphalharSono();

    }
}

class Animal {
    String barulho;

    public void fazBarulho() {
        System.out.println(this.barulho);
    }

    public void atraphalharSono() {
        for (int i = 0; i < 10; i++) {
            this.fazBarulho();
        }
    }

    public Animal(String som) {
        this.barulho = som;
    }
}
