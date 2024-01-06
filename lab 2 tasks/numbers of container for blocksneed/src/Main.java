// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int brickNum = 75;
        int maxAmountOfContainer = 8;
        int containerFull = brickNum / maxAmountOfContainer;
        int leftBlocks = brickNum % maxAmountOfContainer;
        int allContainers = containerFull + (leftBlocks > 0 ? 1 : 0);

        System.out.println("Welcome to answer ");

        System.out.println("brick number " + brickNum);
        System.out.println("amount of container can capture " + maxAmountOfContainer);
        System.out.println("full containers " + containerFull);
        System.out.println("number of blocks which are in the full containers  " + leftBlocks);
        System.out.println("Intotal " + allContainers);
    }
}