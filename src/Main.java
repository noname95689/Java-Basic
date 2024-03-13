import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите текущий курс рубля");
        double roubleExchangeRate = getDoubleFromInput(console.nextLine());
        System.out.println("Пожалуйста, введите количество рублей для обмена");
        double roubleExchangeAmount = getDoubleFromInput(console.nextLine());
        double dollarsAmount = roubleExchangeAmount / roubleExchangeRate;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Количество рублей для обмена: " + df.format(roubleExchangeAmount));
        System.out.println("Курс доллара: " + df.format(roubleExchangeRate));
        System.out.println("Сумма в долларах после обмена: " + df.format(dollarsAmount));

    }

    public static double getDoubleFromInput(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Пожалуйста, введите число");
            return 0;
        }
    }
}