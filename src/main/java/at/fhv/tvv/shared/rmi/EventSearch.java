package at.fhv.tvv.shared.rmi;
import at.fhv.tvv.shared.dto.EventSearchDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;


public interface EventSearch extends Remote {
    List<EventSearchDTO> searchByString(String searchString) throws RemoteException;
    List<EventSearchDTO> searchByDate(String searchDate) throws RemoteException;
}
