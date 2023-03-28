package at.fhv.tvv.shared.dto;

import java.io.Serializable;
import java.util.Date;

public class EventSearchDTO implements Serializable {
    private final int eventId;

    private final String name;

    private final String veranstaltungsserie;

    private final int datum;

    private final String ort;

    private final int plaetze;

    public EventSearchDTO (int eventId, String name, String veranstaltungsserie, int datum, String ort, int plaetze) {
        this.eventId = eventId;
        this.name = name;
        this.veranstaltungsserie = veranstaltungsserie;
        this.datum = datum;
        this.ort = ort;
        this.plaetze = plaetze;
    }

    public int getEventId() {
        return eventId;
    }

    public String getName() {
        return name;
    }

    public String getVeranstaltungsserie() {
        return veranstaltungsserie;
    }

    public int getDatum() {
        return datum;
    }

    public String getOrt() {
        return ort;
    }

    public int getPlaetze() {
        return plaetze;
    }
}
