public class dp {

    static int[] a = new int[101];
    static int[][] b = new int[3][11];
    public static void main(String[] args) {
        // int n = 30;
        // System.out.println(fib3(n));
        int[] cards = new int[]{4,8,6};

        int ans = cardsMax(cards);
        System.out.println(ans);
    }

    public static int fib3(int n){
        a[0] = 1;
        a[1] = 1;

        for(int i = 2; i <= n; i++){
            a[i] = a[i-1] + a[i-2];
        }
        
        return a[n];
    }

    public static int cardsMax(int[] cards){
        int choice, no_choice;

        for(int i = 0; i <= 10; i++){
            if(cards[0] > i){
                b[0][i] = 0;
            }else{
                b[0][i] = cards[0];
            }
        }

        for(int i = 1; i < 3; i++){
            for(int j = 0; j <= 10; j++){
                no_choice = b[i-1][j];
                if(cards[i] > j){
                    b[i][j] = no_choice;
                }else{
                    choice = b[i-1][j - cards[i]] + cards[i];
                    if(choice >= b[i-1][j]) b[i][j] = choice;
                    else b[i][j] = no_choice;
                }
            }
        }

        return b[2][10];
    }
}
