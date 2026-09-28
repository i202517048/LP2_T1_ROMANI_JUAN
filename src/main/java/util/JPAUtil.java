package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final String PERSISTENCE_UNIT = "mysqlconexion";
    private static final EntityManagerFactory fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

    /**
     * Retorna un EntityManager nuevo
     */
    public static EntityManager getEntityManager() {
        return fabrica.createEntityManager();
    }

    /**
     * Cierra la fábrica al finalizar la aplicación
     */
    public static void close() {
        if (fabrica.isOpen()) {
            fabrica.close();
        }
    }
}