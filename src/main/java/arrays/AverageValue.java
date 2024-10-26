package arrays;

public class AverageValue {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        // Променлива за съхранение на сумата на елементите
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // средна стойност
        double average = (double) sum / array.length;

        System.out.println("The average value of the array elements is: " + average);
    }

}

