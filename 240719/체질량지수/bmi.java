import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int b = (10000 * weight) / (height * height);
        System.out.println(b);
        if (b >= 25) {
            System.out.println("Obesity");
        }
    }
}