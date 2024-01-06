import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 'a' is  ");
        double a_Number = scanner.nextInt();

        if (a_Number==0){
            System.out.println("illegal value a");
            System.exit(0);
        }

        System.out.println(" 'b' is ");
        double b_Number = scanner.nextInt();

        System.out.println(" 'c' is ");
        double  c_Number = scanner.nextInt();

        int check_D =(int) (Math.pow(b_Number,2)-(4*a_Number*c_Number));


        int check_Numbers = 3;
        System.out.println("delta: " + check_D);
        if(check_D>0) check_Numbers = 2;
        if(check_D==0) check_Numbers = 1;
        if(check_D<0) check_Numbers = 0;


        double x_1;
        double x_2;
        switch(check_Numbers) {
            case 2:
                x_1=((-b_Number+Math.sqrt(check_D))/(2*a_Number));
                System.out.printf("X1=%.5f%n", x_1);

                x_2=((-b_Number-Math.sqrt(check_D))/(2*a_Number));
                System.out.printf("X2=%.5f%n", x_2);


                break;
            case 1:
                x_1=(double) ((-b_Number)/(2*a_Number));
                System.out.printf("X1=%.5f%n", x_1);

                break;
            case 0:
                System.out.println("no root");

                break;

        }
        scanner.close();
    }
}