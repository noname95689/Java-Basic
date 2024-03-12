import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] =  random.nextInt(41) - 20;
        }
        System.out.println("Выводим минимальное число из массива");
        System.out.println(getMinValue(intArray));
        System.out.println("Выводим максимальное число из массива");
        System.out.println(getMaxValue(intArray));
    }

    public static int getMinValue(int[] intArray) {
        int MIN_VALUE = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] <= MIN_VALUE) {
                MIN_VALUE = intArray[i];
            }
        }
        return MIN_VALUE;
    }

    public static int getMaxValue(int[] intArray) {
        int MAX_VALUE = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] >= MAX_VALUE) {
                MAX_VALUE = intArray[i];
            }
        }
        return MAX_VALUE;
    }
}