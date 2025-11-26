import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    static class SpectateurManager {
        private List<Spectateur> spectateurs = new ArrayList<>();
        private int nextId = 1; // auto-increment ID


        public void addSpectateur(String nom, String email) {
            Spectateur s = new Spectateur(nextId++, nom, email);
            spectateurs.add(s);
            System.out.println(" Spectateur added: " + s.getNom());
        }


        public void addSpectateurFromInput() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter spectator name: ");
            String nom = scanner.nextLine();

            System.out.print("Enter spectator email: ");
            String email = scanner.nextLine();

            addSpectateur(nom, email);
        }


        public void displaySpectateurs() {
            System.out.println(" List of Spectateurs:");
            if (spectateurs.isEmpty()) {
                System.out.println("No spectators yet.");
            } else {
                for (Spectateur s : spectateurs) {
                    System.out.println(s);
                }
            }
        }
    }



}
