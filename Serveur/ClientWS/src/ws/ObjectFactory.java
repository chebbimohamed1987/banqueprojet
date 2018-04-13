
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private final static QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private final static QName _GetComptes_QNAME = new QName("http://ws/", "getComptes");
    private final static QName _AddComptesResponse_QNAME = new QName("http://ws/", "addComptesResponse");
    private final static QName _GetComptesResponse_QNAME = new QName("http://ws/", "getComptesResponse");
    private final static QName _AddCompte2Response_QNAME = new QName("http://ws/", "addCompte2Response");
    private final static QName _ConversionEuroToDollar_QNAME = new QName("http://ws/", "ConversionEuroToDollar");
    private final static QName _AddCompteResponse_QNAME = new QName("http://ws/", "addCompteResponse");
    private final static QName _AddCompte2_QNAME = new QName("http://ws/", "addCompte2");
    private final static QName _AddComptes_QNAME = new QName("http://ws/", "addComptes");
    private final static QName _AddComptes2_QNAME = new QName("http://ws/", "addComptes2");
    private final static QName _AddCompte_QNAME = new QName("http://ws/", "addCompte");
    private final static QName _ConversionEuroToDollarResponse_QNAME = new QName("http://ws/", "ConversionEuroToDollarResponse");
    private final static QName _AddComptes2Response_QNAME = new QName("http://ws/", "addComptes2Response");
    private final static QName _Compte_QNAME = new QName("http://ws/", "compte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link AddComptesResponse }
     * 
     */
    public AddComptesResponse createAddComptesResponse() {
        return new AddComptesResponse();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link AddCompte2Response }
     * 
     */
    public AddCompte2Response createAddCompte2Response() {
        return new AddCompte2Response();
    }

    /**
     * Create an instance of {@link ConversionEuroToDollar }
     * 
     */
    public ConversionEuroToDollar createConversionEuroToDollar() {
        return new ConversionEuroToDollar();
    }

    /**
     * Create an instance of {@link AddCompteResponse }
     * 
     */
    public AddCompteResponse createAddCompteResponse() {
        return new AddCompteResponse();
    }

    /**
     * Create an instance of {@link AddCompte2 }
     * 
     */
    public AddCompte2 createAddCompte2() {
        return new AddCompte2();
    }

    /**
     * Create an instance of {@link AddComptes }
     * 
     */
    public AddComptes createAddComptes() {
        return new AddComptes();
    }

    /**
     * Create an instance of {@link AddComptes2 }
     * 
     */
    public AddComptes2 createAddComptes2() {
        return new AddComptes2();
    }

    /**
     * Create an instance of {@link AddCompte }
     * 
     */
    public AddCompte createAddCompte() {
        return new AddCompte();
    }

    /**
     * Create an instance of {@link ConversionEuroToDollarResponse }
     * 
     */
    public ConversionEuroToDollarResponse createConversionEuroToDollarResponse() {
        return new ConversionEuroToDollarResponse();
    }

    /**
     * Create an instance of {@link AddComptes2Response }
     * 
     */
    public AddComptes2Response createAddComptes2Response() {
        return new AddComptes2Response();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addComptesResponse")
    public JAXBElement<AddComptesResponse> createAddComptesResponse(AddComptesResponse value) {
        return new JAXBElement<AddComptesResponse>(_AddComptesResponse_QNAME, AddComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompte2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCompte2Response")
    public JAXBElement<AddCompte2Response> createAddCompte2Response(AddCompte2Response value) {
        return new JAXBElement<AddCompte2Response>(_AddCompte2Response_QNAME, AddCompte2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDollar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroToDollar")
    public JAXBElement<ConversionEuroToDollar> createConversionEuroToDollar(ConversionEuroToDollar value) {
        return new JAXBElement<ConversionEuroToDollar>(_ConversionEuroToDollar_QNAME, ConversionEuroToDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCompteResponse")
    public JAXBElement<AddCompteResponse> createAddCompteResponse(AddCompteResponse value) {
        return new JAXBElement<AddCompteResponse>(_AddCompteResponse_QNAME, AddCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompte2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCompte2")
    public JAXBElement<AddCompte2> createAddCompte2(AddCompte2 value) {
        return new JAXBElement<AddCompte2>(_AddCompte2_QNAME, AddCompte2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addComptes")
    public JAXBElement<AddComptes> createAddComptes(AddComptes value) {
        return new JAXBElement<AddComptes>(_AddComptes_QNAME, AddComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComptes2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addComptes2")
    public JAXBElement<AddComptes2> createAddComptes2(AddComptes2 value) {
        return new JAXBElement<AddComptes2>(_AddComptes2_QNAME, AddComptes2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCompte")
    public JAXBElement<AddCompte> createAddCompte(AddCompte value) {
        return new JAXBElement<AddCompte>(_AddCompte_QNAME, AddCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDollarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroToDollarResponse")
    public JAXBElement<ConversionEuroToDollarResponse> createConversionEuroToDollarResponse(ConversionEuroToDollarResponse value) {
        return new JAXBElement<ConversionEuroToDollarResponse>(_ConversionEuroToDollarResponse_QNAME, ConversionEuroToDollarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComptes2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addComptes2Response")
    public JAXBElement<AddComptes2Response> createAddComptes2Response(AddComptes2Response value) {
        return new JAXBElement<AddComptes2Response>(_AddComptes2Response_QNAME, AddComptes2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

}
