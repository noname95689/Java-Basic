import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(console.nextLine());
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(console.nextLine());
        System.out.println("Введите символ математической операции");
        String operation = console.nextLine();
        System.out.println(operation);
        int result = switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.println("Результат операции: " + result);
    }
}