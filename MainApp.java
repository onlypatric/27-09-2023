/**
 * MainApp
 * 
 * Questa è la classe principale del progetto.
 * 
 * @author: Pintescul Patric - Eletr Shehab Ali Latif Ali
 * @version: 1.0
 */
public class MainApp {

    /**
     * Il metodo principale del programma.
     * 
     * @param args Gli argomenti passati alla riga di comando.
     */
    public static void main(String[] args) {
        Chooser chooser;
        String input;
        // Crea un oggetto Chooser con opzioni predefinite
        chooser = new Chooser(
                new String[] {
                        "Stampalo",
                        "Visualizza lunghezza",
                        "Visualizza stringa invertita",
                        "Visualizza in maiuscolo",
                        "Rendi i caratteri iniziali di parola maiuscola",
                        "Conta le vocali",
                        "conta le consonanti",
                        "Visualizza in minuscolo",
                        "Esci"
                });
                
        while (true) {
            // Chiedi all'utente di inserire una stringa da manipolare
            System.out.print("Scrivi una stringa da manipolare: ");
            input = Chooser.sc.nextLine();

            // Scegli un'opzione dall'utente
            int choice = chooser.choose();

            // Esegui l'azione corrispondente all'opzione scelta
            switch (choice) {
                case 1:
                    System.out.println(input);
                    break;
                case 2:
                    System.out.println(input.length());
                    break;
                case 3:
                    // Stampa la stringa invertita
                    for (int i = input.length() - 1; i >= 0; i--) {
                        System.out.print(input.charAt(i));
                    }
                    System.out.println();
                    break;
                case 4:
                    // Stampa la stringa in maiuscolo
                    System.out.println(input.toUpperCase());
                    break;
                case 5:
                    if (input.contains(" ")) {
                        for (String string : input.split(" ")) {
                            System.out.print(string.substring(0, 1).toUpperCase() + string.substring(1) + " ");
                        }
                        System.out.println();
                    } else
                        System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1));
                    break;
                case 6:
                    // Conta le vocali nella stringa
                    System.out.println(input.replaceAll("[^aeiou]", "").length());
                    break;
                case 7:
                    // Conta le consonanti nella stringa
                    System.out.println(input.replaceAll("[aeiou]", "").length());
                    break;
                case 8:
                    // Stampa la stringa in minuscolo
                    System.out.println(input.toLowerCase());
                    break;
                default:
                    return;
            }
        }
    }
}
