import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spectateur {
    private int idSpectateur;
    private String nom;
    private String email;

    public Spectateur(int idSpectateur, String nom, String email) {
        this.idSpectateur = idSpectateur;
        this.nom = nom;
        this.email = email;
    }

    public String getNom() { return nom; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Spectateur{id=" + idSpectateur + ", nom='" + nom + "', email='" + email + "'}";
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
