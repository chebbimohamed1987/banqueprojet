package ws;


import entities.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@WebService(serviceName = "BanqueWs")
public class BanqueService {
    List<Compte> cptes = new ArrayList<Compte>();


    @WebMethod(operationName = "ConversionEuroToDollar")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 1.236193;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code) {
        Iterator it = cptes.iterator();
        while (it.hasNext()) {
            Compte compte = (Compte) it.next();
            if (code.equals( compte.getCode())) {
                return compte;
            }
            return null;

        }
        return null;
    }

    @WebMethod
    public List<Compte> getComptes() {
        return cptes;
    }

    @WebMethod
    public void addCompte(/*@WebParam(name="code")Long code, */@WebParam(name = "solde") float solde) {


        cptes.add(new Compte(cptes.size() + 1L, solde, new Date()));

    }


    @WebMethod
    public void addCompte2(@WebParam(name="compte")Compte compte) {
    compte.setCode(cptes.size() + 1L);
    compte.setDateCreation(new Date());

        cptes.add(compte);

    }


    @WebMethod
    public void addComptes(@WebParam(name = "soldes") String soldes) {


        String[] tabSoldes = soldes.split(",");

        for (String soldew:tabSoldes
             ) {
           Float solde= Float.parseFloat(soldew.trim());
           cptes.add(new Compte(cptes.size() + 1L, solde, new Date()));

        }

    }


    @WebMethod
    public void addComptes2(@WebParam(name = "compte") List<Compte> cptes) {


        for (Compte compte:cptes) {

            addCompte2(compte);
        }


    }





}
