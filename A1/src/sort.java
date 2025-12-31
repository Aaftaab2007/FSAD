import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Step 2: Create an array and read elements
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Sort the array
        Arrays.sort(numbers);

        // Step 4: Display the sorted array
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}