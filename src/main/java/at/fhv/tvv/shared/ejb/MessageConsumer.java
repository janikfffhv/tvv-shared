package at.fhv.tvv.shared.ejb;

import at.fhv.tvv.shared.dto.MessageDTO;

import javax.ejb.Remote;
import java.rmi.RemoteException;
import java.util.List;

@Remote
public interface MessageConsumer {
    List<MessageDTO> getMessages(String userName);
    boolean acknowledgeMessage(String userName, String id);
}
