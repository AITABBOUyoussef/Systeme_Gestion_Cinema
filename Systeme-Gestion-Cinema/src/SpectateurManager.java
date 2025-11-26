import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpectateurManager {
    private List<Spectateur> spectateurs = new ArrayList<>();
    private int nextId = 1;

    public void ajouterSpectateur(String nom, String email) {
        Spectateur s = new Spectateur(nextId++, nom, email);
        spectateurs.add(s);
        System.out.println("Spectateur ajouté: " + s.getNom());
    }

    public void ajouterSpectateurInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez nom spectateur: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez email spectateur: ");
        String email = scanner.nextLine();
        ajouterSpectateur(nom, email);
    }

    public void afficherSpectateurs() {
        System.out.println("Liste des Spectateurs:");
        for (Spectateur s : spectateurs) {
            System.out.println(s);
        }
    }

    public List<Spectateur> getSpectateurs() { return spectateurs; }
}