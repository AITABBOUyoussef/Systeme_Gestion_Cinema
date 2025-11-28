public class Spectateur {
    public int id;
    public String nom;
    public String email;

    public Spectateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    @Override
    public String toString() {
        return "// [" + id + "] " + nom + " - " + email;
    }
}
