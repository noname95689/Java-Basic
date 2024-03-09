import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int n = console.nextInt();
        if (n <= 0) {
            System.out.println("Пожалуйста, введите целое положительное число");
            return;
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + " равна: " + getSumOfUnevenNumbers(n));
    }

    public static int getSumOfUnevenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}