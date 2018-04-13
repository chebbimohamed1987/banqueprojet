
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addComptes complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addComptes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soldes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addComptes", propOrder = {
    "soldes"
})
public class AddComptes {

    protected String soldes;

    /**
     * Obtient la valeur de la propri�t� soldes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldes() {
        return soldes;
    }

    /**
     * D�finit la valeur de la propri�t� soldes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldes(String value) {
        this.soldes = value;
    }

}
