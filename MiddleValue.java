import java.util.Scanner;

public class MiddleValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value for y: ");
        int y = scanner.nextInt();
         System.out.print("Enter the value for z: ");
        int z = scanner.nextInt();
        if ((x > y && x < z) || (x < y && x > z)) {
            System.out.println("1");
        } else if ((y > x && y < z) || (y < x && y > z)) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        scanner.close();
    }
}
