import java.util.Scanner;

public class ABC297C {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            char[][] s = new char[h][w];

            for(int i = 0; i < h; i++){
                String line = sc.next();
                for(int j = 0; j < w; j++){
                    s[i][j] = line.charAt(j);
                }
            }

            for(int i = 0; i < h; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < w; j++){
                    sb.append(s[i][j]);
                }
                String ans = sb.toString();
                // if(ans.contains("TTT")) ans = ans.replaceAll("TTT", "TTx");
                // ans = ans.replaceAll("TT", "PC");
                // ans = ans.replaceAll("x", "T");
                ans = ans.replaceAll("TT", "PC");

                System.out.println(ans);
            }
        }   
    }
}