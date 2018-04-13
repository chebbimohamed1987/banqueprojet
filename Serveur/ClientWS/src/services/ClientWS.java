package services;

import ws.Compte;
import ws.BanqueWs;





import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        ws.BanqueService stub= new BanqueWs().getBanqueServicePort();
        System.out.println("Conversion");
        System.out.println( stub.conversionEuroToDollar(9000));
        System.out.println("Consulter un compte");
        stub.addCompte(154L);
        stub.addCompte(15121L);
        Compte cp=stub.getCompte(1L);

        System.out.println("Solde=" + cp.getSolde());
        System.out.println("Liste des comptes");
        List<Compte> cptes=stub.getComptes();
        for(Compte c:cptes) {
            System.out.println(c.getCode() + "----" + c.getSolde() );
        }

    }

}
