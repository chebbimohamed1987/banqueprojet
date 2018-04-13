package entities;

import javax.xml.bind.*;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banque {




    public static void main(String[] args) throws Exception {

        /*marshall();*/

        /*unmarshall();*/
        createSchema();

    }

    public static void marshall() throws JAXBException {


        JAXBContext context = JAXBContext.newInstance(entities.Compte.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        entities.Compte cp = new Compte(1L, 8000, new Date());
        marshaller.marshal(cp, new File("comptes1.xml"));
    }

    public static void unmarshall() throws JAXBException {


        JAXBContext jc = JAXBContext.newInstance(Compte.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Compte cp = (Compte) unmarshaller.unmarshal(new File("comptes2.xml"));
        /*System.out.println("Code: "+ cp.getCode() + "\nSolde: " + cp.getSolde() + "\nDate de création: " + cp.getDateCreation());*/
        System.out.printf("Code: %d \nSolde: %.2f \nDate de cr\u00e9ation: %s",cp.getCode(),cp.getSolde() , cp.getDateCreation());
    }


    public static void createSchema() throws Exception{

        JAXBContext context= JAXBContext.newInstance(Compte.class);
        context.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                File f=new File("compte3.xsd");
                StreamResult result= new StreamResult(f);
                result.setSystemId(f.getName());
                return result;

            }
        });

    }


    public static void createBean() throws Exception{

        /*xjc annuaire4.xsd*/


    }




}
