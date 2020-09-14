import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");

        int input = scanner.nextInt();
        int num;
        int count = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; count < input; i++){
            for (int j = 1; j <= i; j++) {
                num = i;
                count++;
                if(count <= input){
                    sb.append(num).append(" ");
                }

            }
        }

        System.out.println(sb.toString());



    }
}