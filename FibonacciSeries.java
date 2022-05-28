import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int N = scanner.nextInt();
        int a = 0;
        int b = 1;
        int result = 0;
        System.out.println("Fibonacci series :-");
        while (result <= N) {
            result = a + b;
            a = b;
            b = result;
            if (result>=N){
                break;
            }
            System.out.println(result);
        }
    }
}

