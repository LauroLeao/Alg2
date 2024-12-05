package RPG2;

public class prin {
    public static void main(String[] args) {
        mago mago = new mago("bolsonaro", 100, 50);
        guerreiro guerreiro = new guerreiro("lula", 120, 30);
        paladino paladino = new paladino("temer", 110, 40);

        mago.atacar(guerreiro);
        guerreiro.atacar(paladino);
        paladino.atacar(mago);

        System.out.println(guerreiro.getNome() + " está vivo? " + guerreiro.estaVivo());
        System.out.println(mago.getNome() + " está vivo? " + mago.estaVivo());
        System.out.println(paladino.getNome() + " está vivo? " + paladino.estaVivo());
    }
}