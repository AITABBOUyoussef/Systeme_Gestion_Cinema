import java.sql.*;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        boolean exit = false;

        while (!exit) {
            System.out.println("\n||=============================||");
            System.out.println("||====== CINEMA SYSTEM ========||");
            System.out.println("|| 1. Ajouter un film          ||");
            System.out.println("|| 2. Ajouter un spectateur    ||");
            System.out.println("|| 3. Ajouter une séance       ||");
            System.out.println("|| 4. Acheter un ticket        ||");
            System.out.println("|| 5. Afficher films           ||");
            System.out.println("|| 6. Afficher spectateurs     ||");
            System.out.println("|| 7. Afficher séances         ||");
            System.out.println("|| 8. Afficher tickets         ||");
            System.out.println("|| 0. Quitter                  ||");
            System.out.println("||=============================||");
            System.out.print("Choix: ");

            int choix = Integer.parseInt(sc.nextLine());

            switch (choix) {
                case 1 -> ajouterFilm();
                case 2 -> ajouterSpectateur();
                case 3 -> ajouterSeance();
                case 4 -> acheterTicket();
                case 5 -> afficherFilms();
                case 6 -> afficherSpectateurs();
                case 7 -> afficherSeances();
                case 8 -> afficherTickets();
                case 0 -> exit = true;
                default -> System.out.println("Option invalide !");
            }
        }
    }

    static void ajouterFilm() {
        System.out.print("Titre: ");
        String titre = sc.nextLine();

        System.out.print("Durée (minutes): ");
        int duree = Integer.parseInt(sc.nextLine());

        System.out.print("Catégorie: ");
        String categorie = sc.nextLine();

        try (Connection conn = Database.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO film(titre, duree, categorie) VALUES (?,?,?)"
            );
            ps.setString(1, titre);
            ps.setInt(2, duree);
            ps.setString(3, categorie);
            ps.executeUpdate();
            System.out.println("Film ajouté ");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    static void afficherFilms() {
        try (Connection conn = Database.getConnection()) {
            ResultSet rs = conn.createStatement()
                    .executeQuery("SELECT * FROM film");
            System.out.println("\n//////////////////////////////////////////");
            System.out.println("//---------------[ FILMS ]----------------");
            while (rs.next()) {
                System.out.println(
                        new Film(
                                rs.getInt("id"),
                                rs.getString("titre"),
                                rs.getInt("duree"),
                                rs.getString("categorie")
                        )
                );
            }
            System.out.println("//////////////////////////////////////////");

        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    static void ajouterSpectateur() {
        System.out.print("Nom: ");
        String nom = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        try (Connection conn = Database.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO spectateur(nom,email) VALUES (?,?)"
            );
            ps.setString(1, nom);
            ps.setString(2, email);
            ps.executeUpdate();
            System.out.println("Spectateur ajouté !");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    static void afficherSpectateurs() {
        try (Connection conn = Database.getConnection()) {
            ResultSet rs = conn.createStatement()
                    .executeQuery("SELECT * FROM spectateur");
            System.out.println("\n/////////////////////////////////////////////");
            System.out.println("//--------------[ SPECTATEURS ]--------------");
            while (rs.next()) {
                System.out.println(
                        new Spectateur(
                                rs.getInt("id"),
                                rs.getString("nom"),
                                rs.getString("email")
                        )
                );
            }
            System.out.println("/////////////////////////////////////////////");

        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    static void ajouterSeance() {
        System.out.print("ID film: ");
        int idFilm = Integer.parseInt(sc.nextLine());

        System.out.print("Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Heure (HH:MM:SS): ");
        String heure = sc.nextLine();

        System.out.print("Salle: ");
        String salle = sc.nextLine();

        System.out.print("Capacité max: ");
        int capacite = Integer.parseInt(sc.nextLine());

        try (Connection conn = Database.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO seance(film_id, date, heure, salle, capacite_max) VALUES (?,?,?,?,?)"
            );
            ps.setInt(1, idFilm);
            ps.setString(2, date);
            ps.setString(3, heure);
            ps.setString(4, salle);
            ps.setInt(5, capacite);
            ps.executeUpdate();
            System.out.println("Séance ajoutée !");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    static void afficherSeances() {
        try (Connection conn = Database.getConnection()) {
            ResultSet rs = conn.createStatement()
                    .executeQuery("SELECT * FROM seance");
            System.out.println("\n//////////////////////////////////////////////////////////////////");

            System.out.println("//---------------------------[ SEANCES ]--------------------------");
            while (rs.next()) {
                System.out.println(
                        new Seance(
                                rs.getInt("id"),
                                rs.getInt("film_id"),
                                rs.getString("date"),
                                rs.getString("heure"),
                                rs.getString("salle"),
                                rs.getInt("capacite_max")
                        )
                );
            }
            System.out.println("//////////////////////////////////////////////////////////////////");

        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }


    static void acheterTicket() {
        System.out.print("ID spectateur: ");
        int spectateurId = Integer.parseInt(sc.nextLine());

        System.out.print("ID séance: ");
        int seanceId = Integer.parseInt(sc.nextLine());

        System.out.print("Prix: ");
        double prix = Double.parseDouble(sc.nextLine());

        try (Connection conn = Database.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO ticket(spectateur_id,seance_id,prix) VALUES (?,?,?)"
            );
            ps.setInt(1, spectateurId);
            ps.setInt(2, seanceId);
            ps.setDouble(3, prix);
            ps.executeUpdate();
            System.out.println("Ticket acheté !");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    static void afficherTickets() {
        try (Connection conn = Database.getConnection()) {
            ResultSet rs = conn.createStatement()
                    .executeQuery("SELECT * FROM ticket");
            System.out.println("\n//////////////////////////////////////////////////");

            System.out.println("//------------------[ TICKETS ]-------------------");
            while (rs.next()) {
                System.out.println(
                        new Ticket(
                                rs.getInt("id"),
                                rs.getInt("spectateur_id"),
                                rs.getInt("seance_id"),
                                rs.getDouble("prix")
                        )
                );
            }
            System.out.println("//////////////////////////////////////////////////");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
