import java.util.Arrays;
import java.util.Scanner;

public class MinimumNotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of currency denominations
        System.out.println("Enter the size of currency denominations:");
        int size = scanner.nextInt();

        // Input currency denominations
        System.out.println("Enter the currency denominations values:");
        int[] denominations = new int[size];
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        // Sort the denominations in descending order
        Arrays.sort(denominations);
        reverseArray(denominations);

        // Input the amount to pay
        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        // Calculate minimum notes needed
        calculateMinimumNotes(denominations, amount);

        scanner.close();
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    private static void calculateMinimumNotes(int[] denominations, int amount) {
        int remainingAmount = amount;

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        for (int denomination : denominations) {
            if (remainingAmount >= denomination) {
                int notes = remainingAmount / denomination;
                System.out.println(denomination + ":" + notes);
                remainingAmount %= denomination;
            }
        }
    }
}
