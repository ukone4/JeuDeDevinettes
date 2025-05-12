import java.util.Scanner;
import java.util.Random;

public class JeuDeDevinettes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreMystere = random.nextInt(100) + 1;
        int essaisRestants = 10;
        int proposition;

        System.out.println("Bienvenue dans le jeu de devinettes !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. Essayez de le deviner !");

        while (essaisRestants > 0) {
            System.out.print("Entrez votre nombre : ");
            proposition = scanner.nextInt();

            if (proposition == nombreMystere) {
                System.out.println("Félicitations ! Vous avez deviné le bon nombre.");
                break;
            } else if (proposition < nombreMystere) {
                System.out.println("Le nombre est plus grand.");
            } else {
                System.out.println("Le nombre est plus petit.");
            }

            essaisRestants--;
            if (essaisRestants == 0) {
                System.out.println("Dommage ! Vous avez épuisé vos essais. Le nombre était " + nombreMystere);
            } else {
                System.out.println("Il vous reste " + essaisRestants + " essais.");
            }
        }

        scanner.close();
    }
}
