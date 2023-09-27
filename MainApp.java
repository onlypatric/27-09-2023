import java.util.Arrays;

/**
 * MainApp
 */
public class MainApp {

    public static void main(String[] args) {
        Chooser chooser;

        System.out.print("Write a string to manipulate: ");
        String input = Chooser.sc.nextLine();

        chooser = new Chooser(
                new String[] {
                        "Stampalo",
                        "Visualizza lunghezza",
                        "Visualizza stringa invertita",
                        "Visualizza in maiuscolo",
                        "Rendi i caratteri iniziali di parola maiuscola",
                        "Conta le vocali",
                        "conta le consonanti",
                        "Visualizza in minuscolo"
                });

        int choice = chooser.choose();

        switch (choice) {
            case 1:
                System.out.println(input);
                break;
            case 2:
                System.out.println(input.length());
                break;
            case 3:
                for (int i = input.length() - 1; i >= 0; i--) {
                    System.out.print(input.charAt(i));
                }
                System.out.println();
                break;
            case 4:
                System.out.println(input.toUpperCase());
                break;
            case 5:
                System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1));
                break;
            case 6:
                System.out.println(input.replaceAll("[^aeiou]", "").length());
                break;
            case 7:
                System.out.println(input.replaceAll("[aeiou]", "").length());
                break;
            case 8:
                System.out.println(input.toLowerCase());
                break;
            default:
                break;
        }
        Chooser.sc.close();
    }
}