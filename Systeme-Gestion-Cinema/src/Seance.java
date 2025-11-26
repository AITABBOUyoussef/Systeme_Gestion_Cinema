import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Seance {
    private int idSeance;
    private LocalDateTime horaire;
    private String salle;
    private int capaciteMax;
    private Film film;
    private List<Ticket> tickets = new ArrayList<>();

    public Seance(int idSeance, LocalDateTime horaire, String salle, int capaciteMax, Film film) {
        this.idSeance = idSeance;
        this.horaire = horaire;
        this.salle = salle;
        this.capaciteMax = capaciteMax;
        this.film = film;
    }

    public int getIdSeance() { return idSeance; }
    public void setIdSeance(int idSeance) { this.idSeance = idSeance; }
    public LocalDateTime getHoraire() { return horaire; }
    public void setHoraire(LocalDateTime horaire) { this.horaire = horaire; }
    public String getSalle() { return salle; }
    public void setSalle(String salle) { this.salle = salle; }
    public int getCapaciteMax() { return capaciteMax; }
    public void setCapaciteMax(int capaciteMax) { this.capaciteMax = capaciteMax; }
    public Film getFilm() { return film; }

    public List<Ticket> getTickets() { return tickets; }

    public void ajouterTicket(Ticket ticket) {
        if (tickets.size() < capaciteMax) {
            this.tickets.add(ticket);
            System.out.println("Ticket ajouté pour la séance");
        } else {
            System.out.println("Salle pleine!");
        }
    }

    public String toString() {
        return "Seance{id=" + idSeance + ", film='" + film.getTitre() + "', horaire=" + horaire + ", salle='" + salle + "', capacite=" + capaciteMax + "}";
    }
    public int getNombreSpectateursInscrits() {
        return tickets.size();
    }
    }
