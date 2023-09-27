import java.util.Scanner;

/**
 * Chooser
 */
public class Chooser {
    public static Scanner sc = new Scanner(System.in);
    private String[] choices;

    public Chooser(String[] choices) {
        this.choices = choices;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int choose() {
        int maxSize = 0;
        for (String string : choices) {
            if (maxSize < string.length())
                maxSize = string.length();
        }
        maxSize += Integer.toString(choices.length).length() + 3;
        System.out.println("*" + "-".repeat(maxSize) + "*");
        for (int i = 0; i < choices.length; i++) {
            System.out.println("|" + (i + 1) + ". " + choices[i]);
        }
        System.out.println("*" + "-".repeat(maxSize) + "*");
        int choice;
        do {
            try {
                System.out.print(String.format(" select an item (1-%s) >>> ", choices.length));
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Issue while receiving input, retry");
                choice = 0;
            }
        } while (choice < 1 || choice > choices.length);
        return choice;
    }
}