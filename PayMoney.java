import java.util.Scanner;

public class PayMoney {
    public static void findTransactionToAchieveTarget(int[] transactions, int target) {
        int currentSum = 0;
        int transactionsNeeded = 0;

        for (int i = 0; i < transactions.length; i++) {
            currentSum += transactions[i];
            transactionsNeeded++;

            if (currentSum >= target) {
                System.out.println("Target achieved after " + transactionsNeeded + " transactions");
                return;
            }
        }

        System.out.println("Given target is not achieved");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Case 1
        System.out.print("enter the size of transaction array: ");
        int size = scanner.nextInt();
        int[] transactions = new int[size];

        System.out.print("enter the values of array: ");
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.print("enter the total no of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();

        for (int i = 0; i < numTargets; i++) {
            System.out.print("enter the value of target: ");
            int targetValue = scanner.nextInt();
            findTransactionToAchieveTarget(transactions, targetValue);
        }

        // Test Case 2
        System.out.print("enter the size of transaction array: ");
        size = scanner.nextInt();
        transactions = new int[size];

        System.out.print("enter the values of array: ");
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.print("enter the total no of targets that need to be achieved: ");
        numTargets = scanner.nextInt();

        for (int i = 0; i < numTargets; i++) {
            System.out.print("enter the value of target: ");
            int targetValue = scanner.nextInt();
            findTransactionToAchieveTarget(transactions, targetValue);
        }

        scanner.close();
    }
}
