package spectator;
public class Spectateur {
    private int id;
    private String nom;
    private String email;

    public Spectateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public String getNom() { return nom; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Spectateur{id=" + id + ", nom='" + nom + "', email='" + email + "'}";
    }
}
