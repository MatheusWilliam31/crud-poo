package com.mycompany.crudpoo.dados;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class acessoBanco {

    //PADRÃO SINGLETON
    private static EntityManagerFactory entityManagerFactory;

    private acessoBanco() {

    }

    public static EntityManagerFactory getInstance() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("crudPooPU");
        }
        return entityManagerFactory;
    }
}
