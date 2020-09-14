import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        int solution;
        if (number < 0){
            solution = -1;
        } else if (number == 0) {
            solution = 0;
        } else {
            solution = 1;
        }

        return solution;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}