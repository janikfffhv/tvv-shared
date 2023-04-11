package at.fhv.tvv.shared.dto;

import java.io.Serializable;
import java.util.UUID;

public class CustomerEventDTO implements Serializable {
    private final UUID ticketID;
    private final String eventName;
    private final String verkaufsZeitpunkt;
    private final String zahlungsmethode;

    public CustomerEventDTO(UUID ticketID, String eventName, String verkaufsZeitpunkt, String zahlungsmethode) {
        this.ticketID = ticketID;
        this.eventName = eventName;
        this.verkaufsZeitpunkt = verkaufsZeitpunkt;
        this.zahlungsmethode = zahlungsmethode;
    }

    public UUID getTicketID() {
        return ticketID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getVerkaufsZeitpunkt() {
        return verkaufsZeitpunkt;
    }

    public String getZahlungsmethode() {
        return zahlungsmethode;
    }
}
