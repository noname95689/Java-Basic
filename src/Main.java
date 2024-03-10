import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] multiArray = createDoubleDimensionalArray();
        for (int i = 0; i < multiArray[0].length; i++) {
            System.out.println(multiArray[0][i]*3);
        }
    }

    public static int[][] createDoubleDimensionalArray() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int n = console.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int m = console.nextInt();
        int[][] doubleDimensionalArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                doubleDimensionalArray[i][j] = console.nextInt();
            }
        }
        return doubleDimensionalArray;
    }
}