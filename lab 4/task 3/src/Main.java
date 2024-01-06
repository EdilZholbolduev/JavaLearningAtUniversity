import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "!";
        Scanner sc = new Scanner(System.in);
        String s = """
               -------------------------------------------
               Choose what operation you want to perform:
               A. Convert from any system to decimal
               B. Convert from decimal to any system
               C. Add numbers from different systems
               D. Subtract numbers from different systems
               E. Multiply numbers from different systems
               F. Divide numbers from different systems
               
               W. Exit the program
                """;
        do {
            System.out.println(s);
            input = sc.nextLine();
            if(input.equalsIgnoreCase("A")){
                System.out.println("Asking the format");
                System.out.println("Converting from any to decimal");
            }else if(input.equalsIgnoreCase("B")){
                System.out.println("Asking the format");
                System.out.println("Converting from decimal to any");
            }else if(input.equalsIgnoreCase("C")){
                System.out.println("Asking the format of first");
                System.out.println("Asking the format of second");
                System.out.println("Adding");
            }else if(input.equalsIgnoreCase("D")){
                System.out.println("Asking the format of first");
                System.out.println("Asking the format of second");
                System.out.println("Subtracting");
            }else if(input.equalsIgnoreCase("E")){
                System.out.println("Asking the format of first");
                System.out.println("Asking the format of second");
                System.out.println("Multiplying");
            }else{
                System.out.println("Asking the format of first");
                System.out.println("Asking the format of second");
                System.out.println("Dividing");
            }
        }while(!input.equalsIgnoreCase("W"));
        System.out.println("------------------");
        System.out.println("EXITED");
    }
}