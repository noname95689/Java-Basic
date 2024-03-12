import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку из слов разделенных пробелами: ");
        String input = console.nextLine();
        String[] inputArray = input.split(" ");
        int latinWordsCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].matches("[a-zA-Z]+")) {
                System.out.println(inputArray[i]);
                latinWordsCount++;
            }
        }
        System.out.println("Количество слов состоящих из латиницы: " + latinWordsCount);
    }
}