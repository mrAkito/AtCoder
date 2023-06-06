import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String s = sc.next();
            int cnt = 0;
            int flg = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i)== '|'){
                    cnt += 1;
                }else if(s.charAt(i) == '*' && cnt == 1){
                    flg = 1;
                } 
            }

            System.out.println(flg == 1  && cnt == 2? "in" : "out");
        }
    }
}