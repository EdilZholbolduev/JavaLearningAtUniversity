import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("weight?");
        float weightUser = scanner.nextFloat();

        System.out.println("height?");
        float heightUser = scanner.nextFloat();

        double BMI = weightUser/(Math.pow((heightUser/100),2));

        System.out.printf("BMI: %.2f%n",BMI);
        if(BMI == 16.00){
            System.out.println("Starvation");
        }
        if(BMI > 16.00 && BMI <= 16.99){
            System.out.println("Emaciation");
        }
        if(BMI >= 17.00 && BMI <= 18.49){
            System.out.println("Underweight");
        }
        if(BMI >= 18.50 && BMI <= 22.99){
            System.out.println("Normal, low range");
        }
        if(BMI >= 23.00 && BMI <= 24.99){
            System.out.println("Normal, high range");
        }
        if(BMI >= 25.00 && BMI <= 27.49){
            System.out.println("Overweight, low range");
        }
        if(BMI >= 27.50 && BMI <= 29.99){
            System.out.println("Overweight, high range");
        }
        if(BMI >= 30 && BMI <= 34.9){
            System.out.println("1st degree obesity");
        }
        if(BMI >= 35 && BMI <= 39.9){
            System.out.println("2nd degree obesity");
        }
        if(BMI == 40 ){
            System.out.println("Degree obesity");
        }
        else{
            System.out.println("You need to go to hospital!!!");
        }

        scanner.close();


    }
}