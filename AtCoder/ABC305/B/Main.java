package AtCoder.ABC305.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int h = sc.nextInt();
            int w = sc.nextInt();
            char[][] grid =  new char[h][w];

            for(int i = 0; i< h; i++){
                String line = sc.next();
                for(int j = 0; j < w; j++){
                    grid[i][j] = line.charAt(j);
                }
            }

            List<Integer> ans = new ArrayList<>();
            int ansX = 0;
            int ansY = 0;

            for(int i = 0; i< h; i++){
                for(int j = 0; j < w; j++){
                    if(grid[i][j] == '.'){
                        int num = chkAround(grid, j, i, h, w);
                        ans.add(num);
                        if(Collections.max(ans) == num){
                            ansX = j;
                            ansY = i;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ansX);
            sb.append(" ");
            sb.append(ansY);

            System.out.println(sb.toString());
        }   
    }

    static int chkAround(char[][] grid, int x, int y, int h, int w){
        int res = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        for(int i = 0; i < 4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];

            if(xx >= 0 && yy >= 0 && xx < w && yy < h){
                if(grid[xx][yy] == '#') res++;
            }
        }
        return res;
    }
}
