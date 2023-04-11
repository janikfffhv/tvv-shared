package at.fhv.tvv.shared.dto;

public class PlatzDTO {
    private final int platzId;
    private final int nummer;
    private final String kategorie;
    private final int reihe;
    private final int verkaufsId;

    public PlatzDTO(int platzId, int nummer, String kategorie, int reihe, int verkaufsId) {
        this.platzId = platzId;
        this.nummer = nummer;
        this.kategorie = kategorie;
        this.reihe = reihe;
        this.verkaufsId = verkaufsId;
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

    public int getVerkaufsId() {
        return verkaufsId;
    }
}
