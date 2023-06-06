import java.util.*;

public class DFS{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		boolean[][] searched = new boolean[h][w];
		int sx = 0, sy = 0, gx = 0, gy = 0;
		
		for(int i=0;i<h;i++) {
			String str = sc.next();;
			
			for(int j=0;j<w;j++) {
				map[i][j] = str.charAt(j);
				
				if(map[i][j]=='s') {
					sx = j;
					sy = i;
				}else if(map[i][j] == 'g'){
					gx = j;
					gy = i;
				}
			}
		}
		sc.close();

		int[] dx = {0, 1, 0, -1};
		int[] dy = {-1, 0, 1, 0};

		Deque<Plot> stack = new ArrayDeque<Plot>();
		stack.addFirst(new Plot(sx, sy));
		searched[sy][sx] = true;

		while(!stack.isEmpty()){
			Plot p = stack.removeFirst();
			for(int i = 0; i < 4; i++){
				int x = p.x + dx[i];
				int y = p.y + dy[i];

				if(x >= 0 && y >= 0 && y < h){
					stack.addFirst(new Plot(x, y));
					searched[y][x] = true;
				}
			}
		}

		System.out.println(searched[gy][gx] ? "Yes" : "No");
	}
}

class Plot{
	int x;
	int y;

	Plot(int a, int b){
		this.x = a;
		this.y = b;
	}
}