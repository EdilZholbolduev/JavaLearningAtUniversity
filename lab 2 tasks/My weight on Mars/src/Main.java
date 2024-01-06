
public class Main {
    public static void main(String[] args) {
        float earthWeight = 70.0f;
        float gOfMars = 0.38f;

        double marsWeight = earthWeight * gOfMars;
        System.out.println("My weight on Mars in double " + String.format("%.4f", marsWeight));

        int intMars = (int) marsWeight;
        System.out.println("My weight on Mars in int" + intMars);

        char charMars = (char) intMars;
        System.out.println("My weight on Mars in char: " + charMars);

        int value = charMars * 2;
        System.out.println("char + int is equal to " + value);
    }
}