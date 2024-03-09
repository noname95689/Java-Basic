package basic.course;

import java.util.Scanner;

public class DistanceConvertor {
    /**
     * Отношение величин расстояний к метру
     */
    final static double meter = 1.0;
    final static double mile = 0.0006;
    final static double yard = 1.09;
    final static double foot = 3.2;

    public static void distanceConverter() {
        System.out.println("""
                Выберите единицу измерения:
                1 - метры
                2 - мили
                3 - ярды
                4 - футы""");
        Scanner console = new Scanner(System.in);
        int distanceType = Integer.parseInt(console.nextLine());
        System.out.println("Введите количество единиц");
        double distanceQuantity = Double.parseDouble(console.nextLine());
        if (distanceType == 1) {
            convertMeters(distanceQuantity);
        } else if (distanceType == 2) {
            convertMiles(distanceQuantity);
        } else if (distanceType == 3) {
            convertYards(distanceQuantity);
        } else if (distanceType == 4) {
            convertFoots(distanceQuantity);
        }
    }

    public static void convertMeters(double meters) {
        System.out.println("Метры: " + meters);
        System.out.println("Мили: " + meters*mile);
        System.out.println("Ярды: " + meters*yard);
        System.out.println("Футы: " + meters*foot);
    }

    public static void convertMiles(double miles) {
        System.out.println("Метры: " + miles/mile);
        System.out.println("Мили: " + miles);
        System.out.println("Ярды: " + (miles/mile)*yard);
        System.out.println("Футы: " + (miles/mile)*foot);
    }

    public static void convertYards(double yards) {
        System.out.println("Метры: " + yards/yard);
        System.out.println("Мили: " + (yards/yard)*mile);
        System.out.println("Ярды: " + yards);
        System.out.println("Футы: " + (yards/yard)*foot);
    }

    public static void convertFoots(double foots) {
        System.out.println("Метры: " + foots/foot);
        System.out.println("Мили: " + (foots/foot)*mile);
        System.out.println("Ярды: " + (foots/foot)*yard);
        System.out.println("Футы: " + foots);
    }
}
