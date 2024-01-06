public class Main {
    public static void main(String[] args) {

        int evenNumbers = 0;

        for(int i=100; i>1; --i){
            if(i%2==0){
                evenNumbers+=i;
            }
        }
        System.out.println(evenNumbers);
    }

}