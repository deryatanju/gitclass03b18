public class Q7 {
    public static void main(String[] args) {
        int firstNum=0, secondNum=1, sum=0;
        for (int i = 2; i <10 ; i++) {
            sum=firstNum+secondNum;
            System.out.print(sum+" ");
            firstNum=secondNum;
            secondNum=sum;

        }

    }
}
