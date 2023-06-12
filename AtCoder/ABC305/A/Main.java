import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int ans = 0;

            if(n % 5 == 0) ans = n;
            else if(n % 5 < 3) ans = n / 5 * 5;
            else ans =n / 5 * 5 + 5;

            System.out.println(ans);
        }   
    }
}