package RPG2;


public class mago extends personagem {
    public mago(String nome, int hp, int sp) {
        super(nome, hp, sp);
    }
    public void atacar(personagem alvo) {
        int dano = 10; // Dano mágico fixo
        System.out.println(nome + " ataca " + alvo.getNome() + " com magia!");
        alvo.receberDano(dano);
    }
}