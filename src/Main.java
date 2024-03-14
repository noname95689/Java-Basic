import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int numberOfStrings;
        if (console.hasNextInt()) {
            numberOfStrings = console.nextInt();
            console.nextLine();
        } else {
            System.out.println("Пожалуйста, введите целое число");
            return;
        }
        String[] inputArrayOfStrings = new String[numberOfStrings];
        for (int i = 0; i < inputArrayOfStrings.length; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            inputArrayOfStrings[i] = console.nextLine();
        }

        int maxUniqueSymbols = 0;
        String maxUniqueSymbolsString = "";

        for (String stringInArray : inputArrayOfStrings) {
            Set<Character> uniqueChars = new HashSet<>();
            for (int i = 0; i < stringInArray.length(); i++) {
                uniqueChars.add(stringInArray.charAt(i));
            }
            if (uniqueChars.size() > maxUniqueSymbols) {
                maxUniqueSymbols = uniqueChars.size();
                maxUniqueSymbolsString = stringInArray;
            }
        }
        System.out.println("Строка с максимальным количеством уникальных символов: " + maxUniqueSymbolsString);
        System.out.println("Количество символов в строке: " + maxUniqueSymbols);
    }
}