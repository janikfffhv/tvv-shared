package at.fhv.tvv.shared.dto;

import java.util.UUID;

public class PlatzDTO {
    private final int platzId;
    private final int nummer;
    private final String kategorie;
    private final int reihe;
    private final UUID verkaufsId;
    private final float preis;

    public PlatzDTO(int platzId, int nummer, String kategorie, int reihe, UUID verkaufsId, float preis) {
        this.platzId = platzId;
        this.nummer = nummer;
        this.kategorie = kategorie;
        this.reihe = reihe;
        this.verkaufsId = verkaufsId;
        this.preis = preis;
    }

    public int getPlatzId() {
        return platzId;
    }

    public int getNummer() {
        return nummer;
    }

    public String getKategorie() {
        return kategorie;
    }

    public int getReihe() {
        return reihe;
    }

    public UUID getVerkaufsId() {
        return verkaufsId;
    }

    public float getPreis() {
        return preis;
    }
}
