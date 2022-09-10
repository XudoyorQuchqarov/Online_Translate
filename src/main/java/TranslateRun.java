import java.util.Locale;
import java.util.Scanner;

public class TranslateRun {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Select language");
            System.out.println("1. En\n2. Ru\n3. Uz");
            String next = scanner.next().toUpperCase(Locale.ROOT);

            System.out.println("\n----------------------------------------------------\n");
            System.out.println("From: ");
            String choice = scanner.next().toUpperCase(Locale.ROOT);

            System.out.println("\n----------------------------------------------------\n");
            System.out.println("1. En\n2. Ru\n3. Uz");
            String language = scanner.next();
            System.out.println("\n----------------------------------------------------\n");


            switch (next) {
                case "1":
                    WordsEn wordsEn = WordsEn.valueOf(choice);
                    if (language.equals("1"))
                        System.out.println(choice);
                    if (language.equals("2"))
                        System.out.println(wordsEn.ru);
                    if (language.equals("3"))
                        System.out.println(wordsEn.uz);
                    break;
                case "2":
                    WordsRu wordsRu = WordsRu.valueOf(choice);
                    if (language.equals("1"))
                        System.out.println(wordsRu.en);
                    if (language.equals("2"))
                        System.out.println(choice);
                    if (language.equals("3"))
                        System.out.println(wordsRu.uz);
                    break;
                case "3":
                    WordsUz wordsUz = WordsUz.valueOf(choice);
                    if (language.equals("1"))
                        System.out.println(wordsUz.en);
                    if (language.equals("2"))
                        System.out.println(wordsUz.ru);
                    if (language.equals("3"))
                        System.out.println(choice);
                    break;

            }
            System.out.println("\n----------------------------------------------------\n");

        }
    }
}
