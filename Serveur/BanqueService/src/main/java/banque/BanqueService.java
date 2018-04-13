/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package banque;

public interface BanqueService extends java.rmi.Remote {
    public banque.Compte[] getComptes() throws java.rmi.RemoteException;
    public void addComptes2(banque.Compte[] compte) throws java.rmi.RemoteException;
    public void addCompte2(banque.Compte compte) throws java.rmi.RemoteException;
    public void addComptes(java.lang.String soldes) throws java.rmi.RemoteException;
    public banque.Compte getCompte(java.lang.Long code) throws java.rmi.RemoteException;
    public void addCompte(float solde) throws java.rmi.RemoteException;
    public double conversionEuroToDollar(double montant) throws java.rmi.RemoteException;
}
