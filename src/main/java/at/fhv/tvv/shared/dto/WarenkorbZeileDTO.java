package at.fhv.tvv.shared.dto;

import java.io.Serializable;

public class WarenkorbZeileDTO implements Serializable {

    private final int platzId;
    private final String kategorie;
    private final int eventId;
    private final String eventName;
    private final float preis;

    public WarenkorbZeileDTO(int platzId, String kategorie, int eventId, String eventName, float preis) {
        this.platzId = platzId;
        this.kategorie = kategorie;
        this.eventId = eventId;
        this.eventName = eventName;
        this.preis = preis;
    }

    public int getPlatzId() {
        return platzId;
    }

    public String getKategorie() {
        return kategorie;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public float getPreis() {
        return preis;
    }
}
