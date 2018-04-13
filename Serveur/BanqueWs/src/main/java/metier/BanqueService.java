package metier;

import entities.Compte;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    private IBanqueMetier metier;
    @WebMethod(exclude=true)
    public void setMetier(IBanqueMetier metier) {this.metier = metier; }
    @WebMethod
    @Oneway
    public void addCompte(@WebParam(name="solde")float solde){
        metier.addCompte(new Compte(null, solde,new Date()));
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code")Long code){
        return metier.getCompte(code);
    }
    @WebMethod
    public List<Compte> getComptes(){ return metier.listComptes(); }
    @WebMethod
    public void verser(
            @WebParam(name="code")Long code,
            @WebParam(name="montant")double mt){ metier.verser(code, mt); }
    @WebMethod
    public void retirer(
            @WebParam(name="code")Long code,
            @WebParam(name="montant")double mt){ metier.retirer(code, mt); }
    @WebMethod
    public void virement(
            @WebParam(name="cpte1")Long cpte1,
            @WebParam(name="cpte2")Long cpte2,
            @WebParam(name="montant")double mt){ metier.virement(cpte1, cpte2,
            mt); }
    @WebMethod
    public void supprimerCompte(@WebParam(name="code")Long code) {
        metier.deleteCompte(code);
    }}
