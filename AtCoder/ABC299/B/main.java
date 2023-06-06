import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int t = sc.nextInt();
            List<Integer> c = new ArrayList<>();
            int[] r = new int[n];

            for(int i = 0; i < n; i++){
                c.add(sc.nextInt());
            }

            for(int i = 0; i < n; i++){
                r[i] = sc.nextInt();
            }

            List<Integer> num = new ArrayList<>();

            if(c.contains((Object)t)){
                System.out.println(Judge(n, t, c, r, num));
            }else{
                t = c.get(0);
                System.out.println(Judge(n, t, c, r, num));
            }
        }
    }

    private static int Judge(int n, int t, List<Integer> c, int[] r, List<Integer> num){
        int maxN = 0;
        int maxE = 0;

        for(int i = 0; i < n; i++){
            if(c.get(i) == t){
                num.add(i);
            }
        }
        //System.out.println(num);


        for(int i = 0, loop = num.size(); i < loop; i++){
            if(maxN < r[num.get(i)]){
                maxN = r[num.get(i)];
                maxE = num.get(i) + 1;
            }
        }

        return maxE;
    }
}