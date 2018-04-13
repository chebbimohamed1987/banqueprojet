package ws;

import javax.xml.ws.Endpoint;
import java.util.List;

public class ServeurJWS {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url, new BanqueService() {
            public Compte getCompte(Long code) {
                return null;
            }

            public List<Compte> getComptes() {
                return null;
            }

            public void addComptes(String soldes) {

            }

            public void addComptes2(List<Compte> compte) {

            }

            public double conversionEuroToDollar(double montant) {
                return 0;
            }

            public void addCompte(float solde) {

            }

            public void addCompte2(Compte compte) {

            }
        });
        System.out.println(url);


        /*http://localhost:8080/BanqueWS?wsdl*/
        /*http://localhost:8080/BanqueWS?xsd=1*/
    }
}
