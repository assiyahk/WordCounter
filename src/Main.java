import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Nom du fichier à lire
        String nomFichier = "texte.txt";

        // Compteur total de mots
        int totalMots = 0;

        try {
            // Ouvrir le fichier avec File Scanner
            File fichier = new File(nomFichier);
            Scanner lecteur = new Scanner(fichier);

            System.out.println("=== Comptage de mots ===");

            // Lire chaque ligne du fichier
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();

                // Séparer la ligne par les espaces
                String[] mots = ligne.split(" ");

                // Compter les mots de cette ligne
                int motsDansLigne = mots.length;
                totalMots += motsDansLigne;

                System.out.println("Ligne : \"" + ligne + "\" -> " + motsDansLigne + " mots");
            }

            lecteur.close();

            // Afficher le total
            System.out.println("========================");
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : " + nomFichier);
        }
    }
}