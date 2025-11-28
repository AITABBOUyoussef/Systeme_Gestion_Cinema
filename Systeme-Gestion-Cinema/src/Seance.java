public class Seance {
    public int id;
    public int idFilm;
    public String date;
    public String heure;
    public String salle;
    public int capacite;

    public Seance(int id, int idFilm, String date, String heure, String salle, int capacite) {
        this.id = id;
        this.idFilm = idFilm;
        this.date = date;
        this.heure = heure;
        this.salle = salle;
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "[" + id + "] Film:" + idFilm
                + " | " + date + " " + heure
                + " | Salle:" + salle
                + " | Capacité:" + capacite;
    }
}
