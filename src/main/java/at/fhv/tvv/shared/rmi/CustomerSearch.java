package at.fhv.tvv.shared.rmi;
import at.fhv.tvv.shared.dto.CustomerSearchDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface CustomerSearch extends Remote {
    List<CustomerSearchDTO> searchByString(String searchString) throws RemoteException;
    Optional<CustomerSearchDTO> searchById(UUID id) throws RemoteException;
}