import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Seance {
    private int idSeance;
    private LocalTime horaire;
    private String salle;
    private int capaciteMax;
    private Film film;
    private List<Ticket> tickets = new ArrayList<>();

    public Seance(int idSeance, LocalTime horaire, String salle, int capaciteMax, Film film) {
        this.idSeance = idSeance;
        this.horaire = horaire;
        this.salle = salle;
        this.capaciteMax = capaciteMax;
        this.film = film;
    }

    public int getIdSeance() { return idSeance; }
    public void setIdSeance(int idSeance) { this.idSeance = idSeance; }
    public LocalTime getHoraire() { return horaire; }
    public void setHoraire(LocalTime horaire) { this.horaire = horaire; }
    public String getSalle() { return salle; }
    public void setSalle(String salle) { this.salle = salle; }
    public int getCapaciteMax() { return capaciteMax; }
    public void setCapaciteMax(int capaciteMax) { this.capaciteMax = capaciteMax; }
    public Film getFilm() { return film; }

    public List<Ticket> getTickets() { return tickets; }

    public void ajouterTicket(Ticket ticket) {
        if (tickets.size() < capaciteMax) {
            this.tickets.add(ticket);
            System.out.println("Ticket "+ tickets.getFirst().getIdTicket() +" ajouté pour la séance"+idSeance);
        } else {
            System.out.println("Salle pleine!");
        }
    }

    public int getNombreSpectateursInscrits() {
        return tickets.size();
    }
    public String toString() {
        return "Séance " + idSeance + " | " + film.getTitre() + " | " + horaire + " | " + salle + " | " + capaciteMax + " places";
    }

    }
