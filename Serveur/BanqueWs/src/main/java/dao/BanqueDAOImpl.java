package dao;

import entities.Compte;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BanqueDAOImpl implements IBanqueDAO {
    @PersistenceContext
    private EntityManager em;

    public void addCompte(Compte c) {
        em.persist(c);
    }

    public List<Compte> listComptes() {
        Query req =  em.createQuery("select c from Compte c");
        return req.getResultList();
    }

    public Compte getCompte(Long code) {
        Compte cp = em.find(Compte.class, code);
        if (cp == null) throw new RuntimeException("Compte Introuvable");
        return cp;
    }

    public void verser(Long code, double mt) {

    }

    public void retirer(Long code, double mt) {

    }

    public void virement(Long cpte1, Long cpte2, double mt) {

    }

    public void deleteCompte(Long code) {

    }
}