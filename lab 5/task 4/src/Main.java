import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("fist : ");
        String word1 = a.nextLine();
        System.out.println("second : ");
        String word2 = a.nextLine();
        String temp = word1;
        word1 = word1.concat(word2);
        word2 = word2.concat(temp);
        System.out.println(word1.equals(word2));
    }
}