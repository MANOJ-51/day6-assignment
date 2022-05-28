public class ReverseNumber {
    public static void main(String[] args) {
        int number=1234;
        int sum=0;
        int remainder=0;
        for ( ;number!=0;number=number/10 ){
            remainder=number%10;
            sum=sum*10+remainder;
        }
        System.out.println(sum);
    }
}
