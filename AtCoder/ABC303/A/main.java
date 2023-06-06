import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            s = s.replaceAll("1", "l");
            s = s.replaceAll("0", "o");

            t = t.replaceAll("1", "l");
            t = t.replaceAll("0", "o");

            System.out.println(s.equals(t) ? "Yes" : "No");
        }   
    }
}