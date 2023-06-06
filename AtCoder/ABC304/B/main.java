import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int ans = 0;
        
        if(1000 <= n && n < 10000){
            ans = numFloor(n, 1);
        }else if(10000 <= n && n < 100000){
            ans = numFloor(n, 2);
        }else if(100000 <= n && n < 1000000){
            ans = numFloor(n, 3);
        }else if(1000000 <= n && n < 10000000){
            ans = numFloor(n, 4);
        }else if(10000000 <= n && n < 100000000){
            ans = numFloor(n, 5);
        }else if(100000000 <= n && n < 1000000000){
            ans = numFloor(n, 6);
        }else{
            ans = n;
        }
        System.out.println(ans);
    }

    static int numFloor(int n, int digit){
        double ans = n / Math.pow(10, digit);
        ans = Math.floor(ans);
        ans = ans * Math.pow(10, digit);
        return (int)ans;
    }
}