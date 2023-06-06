import java.util.Scanner;

public class ABC297A {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int[] t = new int[n];
            int ans = -1;
            for(int i = 0; i < n; i++){
                t[i] = Integer.parseInt(sc.next());
            }

            for(int i = 0; i < n-1; i++){
                if(t[i+1] - t[i] <= d){
                    ans = t[i+1];
                    break;
                }
            }
            System.out.println(ans);
        }   
    }
}