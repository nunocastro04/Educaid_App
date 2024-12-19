package io.codeforall.app.MA.persistence.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import org.springframework.stereotype.Component;

@Component
public class jpaSessionManager {

    private EntityManagerFactory emf;

    private EntityManager em;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void startSession() {

        if(em == null){
            em = emf.createEntityManager();
        }
    }

    public void stopSession() {
        if(em != null){
            em.close();
        }

        em = null;
    }

    public EntityManager getCurrentSession() {
        startSession();
        return em;
    }
}

