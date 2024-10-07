import java.util.Scanner;

public class MinMaxCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int min = findMinimum(numbers);
        int max = findMaximum(numbers);
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
        scanner.close();
    }

    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
