import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long factorial = 1;
        if(n == 0){
            factorial = 1;
        } else {
            for (int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}