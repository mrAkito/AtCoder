import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] c = new int[n];

            for(int i = 0; i < n; i++){
                c[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                if(a + b == c[i]) System.out.println(i+1);
            }
        }
    }
}