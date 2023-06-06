import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            List<Integer> ans = new ArrayList<>();

            for(int i = 0; i < n; i++){
                arr.add(sc.nextInt());
            }

            for(int i = 0; i < n-1; i++){
                if(Math.abs(arr.get(i)-arr.get(i+1)) != 1){
                    ans = InsertNum(ans, arr.get(i), arr.get(i+1));
                }else{
                    ans.add(arr.get(i));
                }
            }

            ans.add(arr.get(arr.size()-1));


            for(int i = 0; i < ans.size(); i++){
                System.out.print(ans.get(i)+" ");
            }
        }
    }

    static List InsertNum(List<Integer> list, int a, int b){
        if(a < b){
            for(int i = a; i < b; i++){
                list.add(i);
            }
        }else if(a > b){
            for(int i = a; i > b; i--){
                list.add(i);
            }
        }
        return list;
    }
}