import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner("I like Java!!!");
        String input = console.nextLine();
        if (input.contains("Java") && input.startsWith("I like") && input.endsWith("!!!")) {
            System.out.println(input.toUpperCase());
        }
        System.out.println(input.replace("a", "o").substring(7, 11));
    }
}