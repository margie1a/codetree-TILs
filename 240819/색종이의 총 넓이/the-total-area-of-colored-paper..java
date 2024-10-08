import java.util.Scanner;

public class Main {
    public static int MAX = 200;
    public static int HALF = MAX / 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[MAX][MAX];
        for (int i = 0; i < N; i++){
            int row1 = sc.nextInt();
            row1 += HALF;
            int col1 = sc.nextInt();
            col1 += HALF;
            for(int j = row1; j < row1 + 8; j++){
                for (int k = col1; k < col1 + 8; k++){
                    arr[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < MAX; i++){
            for (int j = 0; j < MAX; j++) {
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}