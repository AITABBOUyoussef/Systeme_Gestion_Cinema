import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film(1, "Oppenheimer", 180, "Drame");
        Film film2 = new Film(2, "Barbie", 120, "Comédie");

        Seance seance1 = new Seance(1, LocalTime.of(18,30)  , "Salle 1", 100, film1);
        Seance seance2 = new Seance(2, LocalTime.of(22,00), "Salle 2", 80, film2);

        SpectateurManager manager = new SpectateurManager();
        manager.ajouterSpectateur("Ali", "ali@email.com");
        manager.ajouterSpectateur("Fatima", "fatima@email.com");


        Ticket ticket1 = new Ticket(1, 50.0, manager.getSpectateurs().get(0), seance1);
        Ticket ticket2 = new Ticket(2, 45.0, manager.getSpectateurs().get(1), seance2);


        System.out.println(film1);
        System.out.println(film2);
        System.out.println(seance1);
        System.out.println(seance2);
        System.out.println(ticket1);
        System.out.println(ticket2);
    }
}