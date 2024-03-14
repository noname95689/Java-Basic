import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Введите строку длиной 5 символов
                2 символ должен содержать + или -
                4 символом должно быть =""");
        String input = scanner.nextLine();
        if (input.length() != 5) {
            System.out.println("Пожалуйста, введите строку из 5 символов.");
            return;
        }
        char[] charArray = new char[5];
        for (int i = 0; i < 5; i++) {
            charArray[i] = input.charAt(i);
        }
        if ((charArray[1] == '+' || charArray[1] == '-') && charArray[3] == '=') {
            System.out.println("В уравнении есть + или -, и =");
        } else {
            System.out.println("Строка должен содержать + или - вторым символов, и = четвертым символом");
            return;
        }
        if (charArray[0] == 'x' || charArray[2] == 'x' || charArray[4] == 'x') {
            System.out.println("Строка удовлетворяет условиям");
        } else {
            System.out.println("Первым, третьим или пятым символов в строке должен быть x");
            return;
        }
        int a = (charArray[0] == 'x') ? 0 : Character.getNumericValue(charArray[0]);
        int b = (charArray[2] == 'x') ? 0 : Character.getNumericValue(charArray[2]);
        int c = (charArray[4] == 'x') ? 0 : Character.getNumericValue(charArray[4]);
        int result = 0;
        if (charArray[1] == '+') {
            result = a + b + c;
        } else {
            result = a - b - c;
        }
        System.out.println("Неизвестное уравнения равно: " + result);
    }
}