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
        List<Integer> age = new ArrayList<>();
        List<String> name = new ArrayList<>();

        for(int i = 0; i < n; i++){
            name.add(sc.next());
            age.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        List<String> ans = new ArrayList<>();

        int index = age.indexOf(Collections.min(age));

        for(int i = index; i < n; i++){
            ans.add(name.get(i));
        }
        for(int i = 0; i < index; i++){
            ans.add(name.get(i));
        }

        for(String value : ans) {
            System.out.println(value);
        }
    }
}