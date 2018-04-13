package bean;


import entities.Compte;
import metier.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;
import java.util.Date;
import java.util.List;

@Component
@Path("/banque")

public class BanqueRestService {
    @Autowired
    IBanqueMetier metier;

    @POST

    @Path("/comptes")
    public void addCompte(@FormParam(value = "solde") float solde) {
        metier.addCompte(new Compte(null, solde, new Date()));

    }

    @GET
    @Path("/comptes/{code}")
    @Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Compte getCompte(@PathParam(value="code")Long code){
        return metier.getCompte(code);
    }
    @GET
    @Path("/comptes")
    @Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Compte> getComptes(){
        return metier.listComptes();
    }
    @PUT
    @Path("/comptes/verser")
    public void verser(@FormParam("code") Long code,@FormParam("montant") double
            montant){
        metier.verser(code, montant);
    }

    @PUT
    @Path("/comptes/retirer")
    public void retirer(@FormParam("code") Long code,@FormParam("montant")
            double montant){
        metier.retirer(code, montant);
    }
    @PUT
    @Path("/comptes/virement")
    @Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public void virement(@FormParam("cpte1") Long cpte1,
                         @FormParam("cpte2") Long cpte2,
                         @FormParam("montant") double montant){
        metier.virement(cpte1, cpte2, montant);
    }
    @DELETE
    @Path("/comptes/{code}")
    public void supprimer(@PathParam("code")Long code){
        metier.deleteCompte(code);
    }




}
