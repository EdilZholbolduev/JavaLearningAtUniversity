import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom = random.nextInt(100) + 1;

        System.out.println("random num " + numRandom);

        if (numRandom % 2 == 0) {
            System.out.println("this is an even number");
        } else {
            System.out.println("this is no an even number");
        }
    }
}