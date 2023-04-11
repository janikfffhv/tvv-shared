package at.fhv.tvv.shared.rmi;

import at.fhv.tvv.shared.dto.VerkaufDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Verkauf extends Remote {
    void kaufe(VerkaufDTO verkauf) throws RemoteException;
}
