package at.fhv.tvv.shared.ejb;

import javax.ejb.Remote;
import java.rmi.RemoteException;

@Remote
public interface MessageProducer {
    void produce(String topic, String title, String message);
}
