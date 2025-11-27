import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film(1, "The Godfather", 230, "Crime");
        Film film2 = new Film(2, "La La Land", 150, "Musical Comedie");
        Film film3 = new Film(3, "Inception", 210, "Sci-Fi");

        Seance seance1 = new Seance(1, LocalTime.of(18,30)  , "Salle 1", 100, film1);
        Seance seance2 = new Seance(2, LocalTime.of(22,00), "Salle 2", 80, film2);
        Seance seance3 = new Seance(3, LocalTime.of(15,20), "Salle 3", 160, film3);

        SpectateurManager manager = new SpectateurManager();
        manager.ajouterSpectateur("Ali", "ali@email.com");
        manager.ajouterSpectateur("Fatima", "fatima@email.com");
        manager.ajouterSpectateur("Malak", "Malak@email.com");
        manager.ajouterSpectateur("Yahya", "yahya@email.com");


        Ticket ticket1 = new Ticket(1, 50.0, manager.getSpectateurs().get(0), seance1);
        Ticket ticket2 = new Ticket(2, 45.0, manager.getSpectateurs().get(1), seance2);
        Ticket ticket3 = new Ticket(3, 45.0, manager.getSpectateurs().get(2), seance2);
        Ticket ticket4 = new Ticket(4, 70.0, manager.getSpectateurs().get(3), seance3);


        System.out.println(film1);
        System.out.println(film2);
        System.out.println(film3);
        System.out.println(seance1);
        System.out.println(seance2);
        System.out.println(seance3);
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);
        System.out.println(ticket4);

        seance1.ajouterTicket(ticket1);
        seance2.ajouterTicket(ticket2);
        seance2.ajouterTicket(ticket3);
        seance3.ajouterTicket(ticket4);


        System.out.println("Spectateurs dans séance 1: " + seance1.getNombreSpectateursInscrits());
        System.out.println("Spectateurs dans séance 2: " + seance2.getNombreSpectateursInscrits());
        System.out.println("Spectateurs dans séance 3: " + seance3.getNombreSpectateursInscrits());


        manager.afficherSpectateurs();
    }
}