package com.mycompany.crudpoo.enums;

public enum EnumSexo {
    MASCULINO("Sexo Masculino"),
    FEMININO("Sexo Femenino");

    private EnumSexo(String discricao) {

        this.discricao = discricao;
    }
    private String discricao;

    public String getDiscricao() {
        return discricao;
    }

    @Override
    public String toString() {
        return discricao;
    }

}
