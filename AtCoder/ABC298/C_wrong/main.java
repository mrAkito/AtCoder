import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int q = sc.nextInt();
            Map<Integer, List<Integer>> map = new HashMap<>();
            
            for(int i = 0; i < n; i++){
                map.put(i, new ArrayList<>());
            }

            for(int i = 0; i < q; i++){
                int tmp = sc.nextInt();
                if(tmp == 1){
                    int card = sc.nextInt();
                    map.get(sc.nextInt()).add(card);
                }else if(tmp == 2){
                    int num = sc.nextInt();
                    Collections.sort(map.get(num));
                    for(int ans : map.get(num)){
                        System.out.print(ans+" ");
                    }
                    System.out.println();
                }else if(tmp == 3){
                    int num = sc.nextInt();
                    for(int j = 0; j < n; j++){
                        if(map.get(j).contains(num)){
                            System.out.print(j+" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}