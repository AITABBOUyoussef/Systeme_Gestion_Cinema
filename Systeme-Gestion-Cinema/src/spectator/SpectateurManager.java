package spectator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpectateurManager {
    private List<Spectateur> spectateurs = new ArrayList<>();
    private int nextId = 1; // auto-increment ID

    // Add a spectateur directly (if you already have the info)
    public void addSpectateur(String nom, String email) {
        Spectateur s = new Spectateur(nextId++, nom, email);
        spectateurs.add(s);
        System.out.println(" Spectateur added: " + s.getNom());
    }

    // Ask user for input and add a spectateur
    public void addSpectateurFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter spectator name: ");
        String nom = scanner.nextLine();

        System.out.print("Enter spectator email: ");
        String email = scanner.nextLine();

        addSpectateur(nom, email);
    }

    // Display all spectators
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
