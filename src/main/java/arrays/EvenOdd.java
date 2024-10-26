package arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 10, 5, 9, 12, 21};

        int evenSum = 0;
        int oddSum = 0;

        // Обхождаме масива и сумираме четни и нечетни числа
        for (int num : array) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.printf("Sum of even numbers is %d \n", evenSum);
        System.out.printf("Sum of odd numbers is %d ", oddSum);
    }
}


