package basic.course;

import java.util.Scanner;

public class WeightConvertor {
    /**
     * Отношение величин весов к грамму.
     */
    final static double gr = 1.0;
    final static double kg = 1000.0;
    final static double pound = 453.592;
    final static double ounce = 28.35;

    public static void weightConverter() {
        System.out.println("""
                Выберите единицу измерения:
                1 - граммы
                2 - килограммы
                3 - фунты
                4 - унции""");
        Scanner console = new Scanner(System.in);
        int weightType = Integer.parseInt(console.nextLine());
        System.out.println("Введите количество единиц");
        double weightQuantity = Double.parseDouble(console.nextLine());
        switch (weightType) {
            case 1:
                convertGrs(weightQuantity);
                break;
            case 2:
                convertKgs(weightQuantity);
                break;
            case 3:
                convertPounds(weightQuantity);
                break;
            case 4:
                convertOunces(weightQuantity);
                break;
            default:
                System.out.println("Ошибка: Неверный тип веса");
        }
    }

    public static void convertGrs(double grs) {
        System.out.println("Граммы: " + grs);
        System.out.println("Килограммы: " + grs/kg);
        System.out.println("Фунты: " + grs/pound);
        System.out.println("Унции: " + grs/ounce);
    }

    public static void convertKgs(double kgs) {
        System.out.println("Граммы: " + kgs*kg);
        System.out.println("Килограммы: " + kgs);
        System.out.println("Фунты: " + (kgs*kg)/pound);
        System.out.println("Унции: " + (kgs*kg)/ounce);
    }

    public static void convertPounds(double pounds) {
        System.out.println("Граммы: " + pounds*pound);
        System.out.println("Килограммы: " + pounds*pound/kg);
        System.out.println("Фунты: " + pounds);
        System.out.println("Унции: " + (pounds*pound)/ounce);
    }

    public static void convertOunces(double ounces) {
        System.out.println("Граммы: " + ounces*ounce);
        System.out.println("Килограммы: " + ounces*ounce/kg);
        System.out.println("Фунты: " + ounces*ounce/pound);
        System.out.println("Унции: " + ounces);
    }
}
