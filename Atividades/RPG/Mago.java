package Atividades.RPG;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public String habilidades() {
        return "O Mago pode lançar magias arcanas.";
    }
}