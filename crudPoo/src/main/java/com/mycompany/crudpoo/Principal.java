package com.mycompany.crudpoo;

import com.mycompany.crudpoo.dados.AcessoBanco;
import javax.persistence.EntityManager;

public class Principal {

    public static void main(String[] args) {
        EntityManager em = AcessoBanco.getInstance().createEntityManager();
    }
}
