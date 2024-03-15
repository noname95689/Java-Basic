import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String correctAnswer = "лук";
        System.out.println("""
                Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Что это?
                У вас три попытки
                При первой попытке можно получить подсказку - после этой возможности не будет.
                Для получения подсказки введите "подсказка\""""
        );

        for (int i = 3; i > 0; i--) {
            String input = console.nextLine();
            if (input.toLowerCase().equalsIgnoreCase(correctAnswer)) {
                System.out.println("Правильно!");
                return;
            } else if ((input.equalsIgnoreCase("подсказка") && i == 3 )) {
                System.out.println("Это сьедобное растение");
                System.out.println("Осталось попыток: " + (i-1));
            } else {
                System.out.println("Неправильно! Осталось попыток: " + (i-1));
            }
        }
    }
}