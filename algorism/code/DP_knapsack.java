//https://www.momoyama-usagi.com/entry/info-algo-dp#2-3
package algorism.code;

public class DP_knapsack {

    static int[][] table = new int[5][31];
    public static void main(String[] args) {
        int[] cost = new int[]{120, 150, 140, 110, 100};
        int[] kcal = new int[]{8,10,7,6,7};//each value * 10 is real value
        int LIMIT_KCAL = 30;//the value * 10 is real value

        int max = DpSushi(cost, kcal, LIMIT_KCAL);

        System.out.println(max);
    }

    static int DpSushi(int[] cost, int[] kcal, int LIMIT_KCAL){
        int choice, no_choice;
        for(int i = 0; i < LIMIT_KCAL; i++){
            if(kcal[0] > i){
                table[0][i] = 0;
            }else{
                table[0][i] = cost[0];
            }
        }

        for(int i = 1, n = cost.length; i < n; i++){
            for(int j = 0; j <= LIMIT_KCAL; j++){
                no_choice = table[i-1][j];
                if(kcal[i] > j){
                    table[i][j] = no_choice;
                }else{
                    choice = table[i-1][j - kcal[i]] + cost[i];
                    if(choice >= table[i-1][j]){
                        table[i][j] = choice;
                    }else{
                        table[i][j] = no_choice;
                    }
                }
            }
        }
        return table[cost.length-1][LIMIT_KCAL];
    }
}