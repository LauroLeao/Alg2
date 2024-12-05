package RPG;

// Mago.java
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }
    public String habilidades() {
        return "O Mago pode llançar magias arcanas.";
    }
}