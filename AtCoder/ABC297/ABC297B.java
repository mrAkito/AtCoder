import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC297B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.next();
            String ans = "No";

            List<Integer> B = new ArrayList<>();
            List<Integer> R = new ArrayList<>();
            int K = 0;

            for(int i = 0; i < s.length(); i++){
                if('B' == s.charAt(i)){
                    B.add(i);
                }else if('R' == s.charAt(i)){
                    R.add(i);
                }else if('K' == s.charAt(i)){
                    K = i;
                }
            }
            

            if(B.get(0) % 2 == 0 && B.get(1) % 2 == 1 && R.get(0) < K && K < R.get(1)){
                ans = "Yes";
            }else if(B.get(0) % 2 == 1 && B.get(1) % 2 == 0 && R.get(0) < K && K < R.get(1)){
                ans = "Yes";
            }

            System.out.println(ans);
        }   
    }
}