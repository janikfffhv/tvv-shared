package at.fhv.tvv.shared.dto;

import java.io.Serializable;
import java.util.UUID;

public class CustomerSearchDTO implements Serializable {
    private final UUID customerId;

    private final String vorname;
    private final String nachname;
    private final String geburtsdatum;
    private final String hausnummer;
    private final String strasse;
    private final String plz;
    private final String ort;
    private final String land;
    private final String telefonnummer;

    public CustomerSearchDTO(UUID customerId, String vorname, String nachname, String geburtsdatum, String hausnummer, String strasse, String plz, String ort, String land, String telefonnummer) {
        this.customerId = customerId;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.hausnummer = hausnummer;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
        this.telefonnummer = telefonnummer;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public String getLand() {
        return land;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }
}
