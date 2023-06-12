import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String S = sc.next();
            boolean flg = false;

            for(int i = 0; i < n; i++){
                if(S.charAt(i) == 'x'){
                    flg = false;
                    break;
                }else if(S.charAt(i) == 'o'){
                    flg = true;
                }
            }

            if(flg == true) System.out.println("Yes");
            else{
                System.out.println("No");
            }
        }   
    }
}