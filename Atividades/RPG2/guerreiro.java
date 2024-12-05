package RPG2;


public class guerreiro extends personagem {
    public guerreiro(String nome, int hp, int sp) {
        super(nome, hp, sp);
    }
    public void atacar(personagem alvo) {
        int dano = 15; // Dano físico fixo
        System.out.println(nome + " ataca " + alvo.getNome() + " com espada!");
        alvo.receberDano(dano);
    }
}