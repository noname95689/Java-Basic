import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] =  random.nextInt(41) - 20;
        }
        System.out.println("Выводим минимальное число из массива");
        int min = getMinValue(intArray);
        System.out.println(min);
        System.out.println("Выводим максимальное число из массива");
        int max = getMaxValue(intArray);
        System.out.println(max);
        System.out.println("Выводим максимальное по модулю число");
        System.out.println(getMaxAbsValue(min, max));
    }

    public static int getMinValue(int[] intArray) {
        int MIN_VALUE = Integer.MAX_VALUE;
        for (int j : intArray) {
            if (j <= MIN_VALUE) {
                MIN_VALUE = j;
            }
        }
        return MIN_VALUE;
    }

    public static int getMaxValue(int[] intArray) {
        int MAX_VALUE = Integer.MIN_VALUE;
        for (int j : intArray) {
            if (j >= MAX_VALUE) {
                MAX_VALUE = j;
            }
        }
        return MAX_VALUE;
    }

    public static int getMaxAbsValue(int a, int b) {
        return (Math.abs(a) >= Math.abs(b) ? a : b);
    }
}