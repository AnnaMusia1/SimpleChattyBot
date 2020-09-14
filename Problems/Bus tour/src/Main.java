import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the height of the bus and the number of bridges:");
        int heightOfBus = scanner.nextInt();
        int numOfBridges = scanner.nextInt();

        int[] heightOfBridges = new int[numOfBridges];

//        System.out.println("Enter the height of each bridge:");

        for (int i = 0; i < numOfBridges-1; i++){
            int height = scanner.nextInt();
            if(height <= heightOfBus) {
                System.out.println("Will crash on bridge " + (i + 1));
                return;
            }
        }
        System.out.println("Will not crash");


    }
}