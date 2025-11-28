public class Ticket {
    public int id;
    public int spectateurId;
    public int seanceId;
    public double prix;

    public Ticket(int id, int spectateurId, int seanceId, double prix) {
        this.id = id;
        this.spectateurId = spectateurId;
        this.seanceId = seanceId;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "// [" + id + "] Spectateur: " + spectateurId
                + " - Séance: " + seanceId
                + " - Prix: " + prix + " dh";
    }
}