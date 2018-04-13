package metier;

import dao.IBanqueDAO;
import entities.Compte;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class BanqueMetierImpl implements IBanqueMetier {
    private IBanqueDAO dao;
    public void setDao(IBanqueDAO dao) { this.dao = dao; }

    public void addCompte(Compte c) { dao.addCompte(c);}

    public List<Compte> listComptes() { return dao.listComptes(); }

    public Compte getCompte(Long code) { return dao.getCompte(code); }


    public void verser(Long code, double mt) { dao.verser(code, mt); }

    public void retirer(Long code, double mt) { dao.retirer(code, mt);
    }

    public void virement(Long cpte1, Long cpte2, double mt) {
        dao.virement(cpte1, cpte2, mt);
    }

    public void deleteCompte(Long code) {
        dao.deleteCompte(code);
    }
}
