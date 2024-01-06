import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("first word : ");
        String wordOne = a.nextLine();
        wordOne = wordOne.toLowerCase();
        System.out.println(isPalindrome(wordOne));
    }
    public static boolean isPalindrome(String w){
        int a = 0;
        int b = w.length()-1;
        while(a <= b){
            if(w.charAt(a) != w.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }
}