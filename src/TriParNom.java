import java.util.Comparator;

public class TriParNom implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant etudiant1, Etudiant etudiant2) {
        return etudiant1.getNom().compareTo(etudiant2.getNom());
    }
}
