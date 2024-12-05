package RPG2;


public abstract class personagem {
    protected String nome;
    protected int hp; // Vida
    protected int sp; // Mana


    public personagem(String nome, int hp, int sp) {
        this.nome = nome;
        this.hp = hp;
        this.sp = sp;
    }
    public abstract void atacar(personagem alvo);
    public void receberDano(int dano) {
        hp -= dano;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println(nome + " recebeu " + dano + " de dano. HP restante: " + hp);
    }
    public boolean estaVivo() {
        return hp > 0;
    }
    public String getNome() {
        return nome;
    }
}