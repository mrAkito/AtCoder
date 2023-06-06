import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String s = sc.next();

            int a = 0;
            int t = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'T'){
                    t++;
                }
                else{
                    a++;
                }
            }


            if(t == a){
                a = 0;
                t = 0;
                for(int i = 0; i < n-1; i++){
                    if(s.charAt(i) == 'T'){
                        t++;
                    }
                    else{
                        a++;
                    }
                }
                // if(t > a) System.out.println("T");
                // else System.out.println("A");
            }

            if(t > a) System.out.println("T");
            else System.out.println("A");
        }
    }
}