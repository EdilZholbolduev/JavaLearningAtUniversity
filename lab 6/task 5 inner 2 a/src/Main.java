import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int minIndex = findMinimumIndex(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("The minimum value is at index: " + minIndex);
    }

    private static int findMinimumIndex(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}
