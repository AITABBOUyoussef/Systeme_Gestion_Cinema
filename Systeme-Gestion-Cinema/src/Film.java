public class Film {
    public int id;
    public String titre;
    public int duree;
    public String categorie;

    public Film(int id, String titre, int duree, String categorie) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.categorie = categorie;
    }


    @Override
    public String toString() {
        return "// [" + id + "] " + titre + " (" + duree + "min) - " + categorie;
    }
}
