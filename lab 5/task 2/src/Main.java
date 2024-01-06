import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(0,101);
        }
        int min = 101;
        int max = -1;
        for(int n : arr){
            if(n > max)
                max = n;
            if(n < min)
                min = n;
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}