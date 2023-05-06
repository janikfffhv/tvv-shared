package at.fhv.tvv.shared.ejb;

import javax.ejb.Remote;
import java.rmi.RemoteException;
import java.util.List;

@Remote
public interface RolesTopics {
    List<String> getRoles(String userId);
    List<String> getTopics(String userId);
    void setTopics(List<String> topics, String userId);
}
