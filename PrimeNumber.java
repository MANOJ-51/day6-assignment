import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number=scanner.nextInt();
        boolean is_prime=false;
        for (int i=2;i<=number/2;i++){
            if(number%i==0){
                is_prime=true;
                break;
            }
        }
        if (is_prime!=true){
            System.out.println(number+" IS A PRIME NUMBER");
        }
        else{
            System.out.println(number+" IS NOT A PRIME NUMBER");
        }
    }
}
