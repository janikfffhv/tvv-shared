package at.fhv.tvv.shared.dto;

import java.io.Serializable;
import java.util.Objects;

public class EventDescriptionDTO implements Serializable {
    private final int eventId;

    private final String name;

    private final String veranstaltungsserie;

    private final int datum;

    private final String ort;

    private final String beschreibung;
    private final int plaetze;

    public EventDescriptionDTO(int eventId, String name, String veranstaltungsserie, int datum, String ort, String beschreibung, int plaetze) {
        this.eventId = eventId;
        this.name = name;
        this.veranstaltungsserie = veranstaltungsserie;
        this.datum = datum;
        this.ort = ort;
        this.beschreibung = beschreibung;
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

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getPlaetze() {
        return plaetze;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventDescriptionDTO that = (EventDescriptionDTO) o;
        return eventId == that.eventId && datum == that.datum && plaetze == that.plaetze && Objects.equals(name, that.name) && Objects.equals(veranstaltungsserie, that.veranstaltungsserie) && Objects.equals(ort, that.ort) && Objects.equals(beschreibung, that.beschreibung);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, name, veranstaltungsserie, datum, ort, beschreibung, plaetze);
    }
}


