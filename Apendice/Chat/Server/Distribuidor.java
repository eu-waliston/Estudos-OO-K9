package Apendice.Chat.Server;

import java.util.Collection;

public class Distribuidor {
    private Collection<Emissor> emissors;

    public void adicionaEmissor(Emissor emissor) {
        this.emissors.add(emissor);
    }
    public void distribuiMensagem(String mensagem) {
        for(Emissor emissor : this.emissors) {
            emissor.envia(mensagem);
        }
    }
}
