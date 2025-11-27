public class Ticket {
        private int idTicket;
        private double prix;
        private Spectateur spectateur;
        private Seance seance;

        public Ticket() {}

        public Ticket(int idTicket, double prix, Spectateur spectateur, Seance seance) {
            this.idTicket = idTicket;
            this.prix = prix;
            this.spectateur = spectateur;
            this.seance = seance;
        }

        public int getIdTicket() { return idTicket; }
        public void setIdTicket(int idTicket) { this.idTicket = idTicket; }
        public double getPrix() { return prix; }
        public void setPrix(double prix) { this.prix = prix; }
        public Spectateur getSpectateur() { return spectateur; }
        public void setSpectateur(Spectateur spectateur) { this.spectateur = spectateur; }
        public Seance getSeance() { return seance; }
        public void setSeance(Seance seance) { this.seance = seance; }

        @Override
        public String toString() {
            return "Ticket " + idTicket + " | " + prix + "DH | " + spectateur.getNom() + " | Séance " + seance.getIdSeance();
        }
}
