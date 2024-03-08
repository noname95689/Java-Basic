public class Main {
    public static void main(String[] args) {
        int[] intArray= {1, 7, 11, -1, -5};
        int first = intArray[0];
        int last = intArray[intArray.length -1];
        intArray[0] = last;
        intArray[intArray.length - 1] = first;
        System.out.println(intArray[0] + (intArray.length / 2));
    }
}