package basic.course;

import java.util.Scanner;

import static basic.course.DistanceConvertor.distanceConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Какие величины вы ходите конвертировать? Введите цифру: "
                +"\n1 - масса"
                + "\n2 - расстояние");
        Scanner console = new Scanner(System.in);
        double converterScenario = Double.parseDouble(console.nextLine());
        if (converterScenario == 1) {
            WeightConvertor.weightConverter();
        } else if (converterScenario == 2) {
            distanceConverter();
        } else {
            System.out.println("Пожалуйста, введите 1 или 2.");
        }
    }
}