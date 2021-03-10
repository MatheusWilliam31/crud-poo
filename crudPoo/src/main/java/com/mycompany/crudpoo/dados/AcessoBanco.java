
package com.mycompany.crudpoo.dados;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AcessoBanco {

    private static EntityManagerFactory entityManagerFactory;

    private AcessoBanco() {
    }

    public static EntityManagerFactory getInstance() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("crudPooPu");
        }
        return entityManagerFactory;
    }

}
