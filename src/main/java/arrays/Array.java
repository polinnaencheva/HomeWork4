package arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element at index %d is %s\n ", i, array[i]);
        }
    }
}




