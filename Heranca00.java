public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
        Cachorro fred = new Cachorro();
        fred.fazBarulho();
        Gato minerin = new Gato();
        minerin.fazBarulho();

    }

}

abstract class Animal {
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

}

class Cachorro extends Animal {
    Cachorro() {
        this.onomatopeia = "au au";
        
    }
}

class Gato extends Animal {
    public Gato() {
        this.onomatopeia = "miar";

    }
}
