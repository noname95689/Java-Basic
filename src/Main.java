import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = console.nextInt();
        System.out.println("Введите число y: ");
        int y = console.nextInt();
        System.out.println("Введите число z: ");
        int z = console.nextInt();
        int mathAverage = (x + y + z)/3;
        System.out.println("Среднее арифметическое введенных чисел: " + mathAverage);
        // Для целых чисел остаток от деления и так игноируется, поэтому не округляю результат.
        if ((mathAverage/2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}