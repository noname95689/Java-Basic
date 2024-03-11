import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        String numericString;
        if (console.hasNextInt()) {
            numericString = String.valueOf(console.nextInt());
        } else {
            System.out.println("Пожалуйста, введите целое число");
            return;
        }
        System.out.println();
        int intNumber;
        if (console.hasNextInt()) {
            intNumber = console.nextInt();
        } else {
            System.out.println("Пожалуйста, введите целое число");
            return;
        }
        if ((Integer.valueOf(numericString) >= intNumber)) {
            System.out.println("Наибольшее число: " + numericString);
            System.out.println("Наименьшее число преобразованное в double: " + Double.valueOf(intNumber));
        } else {
            System.out.println("Наибольшее число: " + intNumber);
            System.out.println("Наименьшее число преобразованное в double: " + Double.valueOf(numericString));
        }
    }
}