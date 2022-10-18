package Banco;

public class Cliente {
    String nome;

    public String consultaNome() {
        return this.nome;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }
}
