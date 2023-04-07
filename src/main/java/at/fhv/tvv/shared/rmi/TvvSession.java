package at.fhv.tvv.shared.rmi;

import at.fhv.tvv.shared.dto.WarenkorbZeileDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface TvvSession extends Remote {
    List<WarenkorbZeileDTO> getWarenkorb() throws RemoteException;
    void hinzufuegen(WarenkorbZeileDTO warenkorbZeile) throws RemoteException;
    void loeschen (WarenkorbZeileDTO warenkorbZeile) throws RemoteException;
    void leeren() throws RemoteException;
}
