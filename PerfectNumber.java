import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:-");
        int number=scanner.nextInt();
        int sum =0;
        for (int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if (sum==number){
            System.out.println(number+" IS A PERFECT NUMBER");
        }
        else{
            System.out.println(number+" IS NOT A PERFECT NUMBER");
        }
    }
}
