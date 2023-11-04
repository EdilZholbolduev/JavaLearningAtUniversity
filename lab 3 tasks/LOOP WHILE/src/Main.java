public class Main {
    public static void main(String[] args) {

        int ranNum = 0;
        int maxNum = 0;
        int minNum = 100;

        for(int i=1; i<=10; i++) {
            ranNum =(int) (Math.random()*(100-1));
            if(ranNum>maxNum){
                maxNum=ranNum;
            }
            if(ranNum<minNum){
                minNum=ranNum;
            }
            System.out.println(" randomly " + i + "is" + ranNum);
        }

        System.out.println("maximum number: " + maxNum);
        System.out.println("minimum number: " + minNum);
    }
}