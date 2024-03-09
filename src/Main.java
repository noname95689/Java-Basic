import java.util.Scanner;

public class Main {
    private static final int x = 1;
    private static final int y = -156;
    private static final int z = 1877;
    public static void main(String[] args) {
        int[] userArray = createArray();
        checkIfElementPresent(userArray);
    }

    public static int[] createArray() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arrayLength = console.nextInt();
        int[] userArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            userArray[i] = console.nextInt();
        }
        return userArray;
    }

    public static void checkIfElementPresent(int[] array) {
        for (int j : array) {
            if (j == x || j == y || j == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}