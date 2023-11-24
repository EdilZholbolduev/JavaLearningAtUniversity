public class Main {
    public static void main(String[] args) {
        car car = new car("X", "VOLVO", 2013, 50000, "RED", 10);
        car car1 = new car("BMW", "KIA", 2019, 78000, "BLUE", 20);

        System.out.println(car);
        System.out.println(car1);

        System.out.println("Are they equal ? " + car.equals(car1));
        System.out.println("Car hashcode   : " + car.hashCode());
        System.out.println("Car1 hashcode  : " + car1.hashCode());
    }
}