import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i = n; i > 0; i--){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j <= b; j++){
                sum *= j;
            }
            System.out.println(sum);
            sum = 1;
        }
    }
}