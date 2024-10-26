package arrays;
import java.util.Scanner;
public class Fibonachi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of Fibonacci terms (N): ");
            int N = scanner.nextInt();

            int sum = 0;
            int first = 0;
            int second = 1;

            for (int i = 0; i < N; i++) {
                sum += first;   // Добавя текущото число към сумата
                int next = first + second; // Изчисляваме следващото число
                first = second; // Преместваме първото число на позицията на второто
                second = next;  // Преместваме второто число на позицията на следващото
            }

            System.out.println("The sum of the first " + N + " Fibonacci numbers is: " + sum);
        }
    }


