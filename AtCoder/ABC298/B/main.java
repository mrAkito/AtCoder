import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];

            int acnt = 0;

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                    if(a[i][j] == 1) acnt += 1;
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    b[i][j] = sc.nextInt();
                }
            }

            int[][] temp = new int[n][n];
            int ans = 0;
            temp = a;

            for(int l = 0; l < 4; l++){
                int chk = 0;
                if(l >= 1)temp = lotate(temp, n);
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < n; j++){
                        if(acnt != 0 && temp[i][j] == 1 && b[i][j] == 1){
                            chk++;
                        }
                        //System.out.print(temp[i][j]);
                    }
                    //System.out.println();
                    // System.out.println(chk);
                    // System.out.println(acnt);
                }
                if(acnt == chk){
                    ans = chk;
                    break;
                }
                //System.out.println("##########");
            }
            System.out.println(acnt == ans  ? "Yes" : "No");

        }
    }

    static int[][] lotate(int[][] map, int n){
        int[][] res = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[i][n-j-1] = map[j][i];
            }
        }
        return res;
    }
}