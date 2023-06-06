import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Long a = sc.nextLong();
            Long b = sc.nextLong();

            Long ans = 0L;

            ans = a / b;

            if(a%b > 0){
                ans++;
            }

            System.out.println(ans);
        }   
    }
}