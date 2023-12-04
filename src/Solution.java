import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String mockInput = "42\n100\n125\n";
        Scanner scanner = new Scanner(mockInput);
        // Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            System.out.println(a);
        }
        scanner.close();
    }

}