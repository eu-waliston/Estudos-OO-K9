package Banco;

import Banco.Funcionario;

public class Servico {
    //GERAL ou classe mãe
    private Cliente contratante;
    private Funcionario responsavel;
    private String dataDeContratacao;

    public  double calcullaTaxa() {
        return 5;
    }

}
