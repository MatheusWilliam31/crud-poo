
package com.mycompany.crudpoo.enums;

public enum EnumTipoConta {

    PAGAR("Conta a Pagar", 'D'),
    RECEBER("Conta a Receber", 'C');

    private EnumTipoConta(String descricao, char sigla) {
        this.discricao = discricao;
        this.sigla = sigla;
    }
    private String discricao;

    private char sigla;

    public String getDiscricao() {
        return discricao;
    }

    public char getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return discricao;
    }

}
