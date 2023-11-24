import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;
        boolean swapped;

        System.out.println("before:");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            swapped = false;

            for (int j = 0; j < array.length - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    counter++;
                    int greater = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = greater;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
            if (counter >= 10) {
                break;
            }
        }

        System.out.println("after:");
        System.out.println(Arrays.toString(array));
        System.out.println("num of actions:" + counter);
    }
}
