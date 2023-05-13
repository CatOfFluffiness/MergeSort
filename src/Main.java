import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfrer:");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {

    }

    private static void printArray(int[] numbers) {

    }
}