package Atividades.RPG;

public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int sp;

    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 100; // Vida inicial
        this.sp = 50;  // Alma inicial
    }

    public abstract String habilidades();

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("SP: " + sp);
        System.out.println("Habilidade: " + habilidades());
    }
}