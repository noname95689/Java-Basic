import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] userArray = createArray();
        double mathAverage = getMathAverage(userArray);
        System.out.println("Среднее арифметическое: " + mathAverage);
        for (int i = 0; i < userArray.length; i++) {
            System.out.println(userArray[i]*mathAverage);
        }
    }

    public static double[] createArray() {
        System.out.println("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int arraySize = console.nextInt();
        double[] userArray = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            userArray[i] = console.nextDouble();
        }
        return userArray;
    }

    public static double getMathAverage(double[] userArray) {
        double sum = 0;
        for (int i = 0; i < userArray.length; i++) {
            sum = sum + userArray[i];
        }
        return sum/ userArray.length;
    }

}