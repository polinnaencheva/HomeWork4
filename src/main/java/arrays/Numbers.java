package arrays;
import java.util.Scanner;
public class Numbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number N: ");
            int N = scanner.nextInt();

            System.out.println("Numbers from 1 to " + N + " that are not divisible by both 3 and 7:");
            for (int i = 1; i <= N; i++) {
                if (i % 3 != 0 && i % 7 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }



