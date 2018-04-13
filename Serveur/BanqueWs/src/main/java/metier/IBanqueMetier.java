package metier;

import entities.Compte;

import java.util.List;

public interface IBanqueMetier {

    public void addCompte(Compte c);
    public List<Compte> listComptes();
    public Compte getCompte(Long code);
    public void verser(Long code,double mt);
    public void retirer(Long code, double mt);
    public void virement(Long cpte1,Long cpte2,double mt);
    public void deleteCompte(Long code);
}
