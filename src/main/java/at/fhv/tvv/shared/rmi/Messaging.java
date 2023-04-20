package at.fhv.tvv.shared.rmi;

import at.fhv.tvv.shared.dto.MessageDTO;

import javax.ejb.Remote;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.List;

@Remote
public interface Messaging {

    boolean publish(String sessionId, MessageDTO message) throws RemoteException;

    List<String> getSubscribedTopics(String sessionId) throws RemoteException;

    void updateLastViewed(String sessionId, LocalDateTime lastViewedMessages) throws RemoteException;

    LocalDateTime getLastViewed(String sessionId) throws RemoteException;
}
