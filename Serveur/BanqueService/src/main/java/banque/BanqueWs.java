/**
 * BanqueWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package banque;

public interface BanqueWs extends javax.xml.rpc.Service {
    public java.lang.String getBanqueServicePortAddress();

    public banque.BanqueService getBanqueServicePort() throws javax.xml.rpc.ServiceException;

    public banque.BanqueService getBanqueServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
