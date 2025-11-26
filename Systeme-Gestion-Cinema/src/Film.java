public class Film {
    private int idFilm;
    private String titre;
    private int duree;
    private String categorie;
   private List<Seance> seances;

public Film(int idFilm, String titre, int duree, String categorie) {
    this.idFilm = idFilm;
    this.titre = titre;
    this.duree = duree;
    this.categorie = categorie;
    this.seances = new ArrayList<>();
}

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public void ajouterSeance(Seance seance) {
        this.seances.add(seance);
    }
    public String toString() {
        return "Film [id : " + idFilm + " , titre : " + titre + " , duree : " + duree + "min , categorie : " + categorie + "]";
    }
}