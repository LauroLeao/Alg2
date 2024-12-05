package RPG2;


public class paladino extends personagem {
    public paladino(String nome, int hp, int sp) {
        super(nome, hp, sp);
    }
    public void atacar(personagem alvo) {
        int dano = 12; // Dano físico fixo
        System.out.println(nome + " ataca " + alvo.getNome() + " com um golpe sagrado!");
        alvo.receberDano(dano);
    }
}