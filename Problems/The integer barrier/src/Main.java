import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter numbers to sum:");

        int input = 1;
        int sum = 0;


        while (sum < 1000) {
            input = scanner.nextInt();
            sum = sum + input;
            if (input == 0) {
                break;
            }
        }

        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }


    }
}