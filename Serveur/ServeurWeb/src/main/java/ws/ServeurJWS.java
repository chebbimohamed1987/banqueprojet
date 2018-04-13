package ws;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url, new BanqueService());
        System.out.println(url);


        /*http://localhost:8080/BanqueWS?wsdl*/
        /*http://localhost:8080/BanqueWS?xsd=1*/
    }

}
