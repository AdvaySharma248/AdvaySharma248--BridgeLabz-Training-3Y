import java.util.Arrays;
import java.lang.Math;

public class RandomNumberAnalyzer {

    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[0];
        }

        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, (double)min, (double)max};
    }

    public static void main(String[] args) {
        int[] generatedNumbers = generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit random values: " + Arrays.toString(generatedNumbers));

        double[] analysis = findAverageMinMax(generatedNumbers);

        if (analysis.length == 3) {
            System.out.printf("Average value: %.2f%n", analysis[0]);
            System.out.println("Minimum value: " + (int)analysis[1]);
            System.out.println("Maximum value: " + (int)analysis[2]);
        }
    }
}
