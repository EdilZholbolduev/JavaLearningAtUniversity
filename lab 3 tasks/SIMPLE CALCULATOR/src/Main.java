import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Please enter second number: ");
        float secondNumber = scanner.nextFloat();

        System.out.println("sum of numbers is " + (firstNumber + secondNumber));
        System.out.println("difference between two numbers is " + (firstNumber - secondNumber));
        System.out.println("multiplication of these numbers is " + (firstNumber * secondNumber));
        System.out.println("division of numbers " + (firstNumber / secondNumber));


        scanner.close();
        System.out.println("Edil Zholbolduev id:64875, group number 1");
    }
}