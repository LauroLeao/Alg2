package RPG;

public class sacerdote extends Personagem {
    public sacerdote(String nome) {
        super(nome);
    }
    public String habilidades() {
        return "O Sacerdote pode usar magias divinas.";
    }
}