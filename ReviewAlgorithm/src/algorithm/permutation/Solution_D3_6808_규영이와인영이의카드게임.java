package algorithm.permutation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6808_규영이와인영이의카드게임 {

	static int size = 9, win, lose;
	static int[] gyu, inyoungNums, inyoung;
	static boolean numbers[], visit[];

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder answer = new StringBuilder();

		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc < T + 1; tc++) {
			st = new StringTokenizer(in.readLine(), " ");
			gyu = new int[size];
			inyoung = new int[size];
			inyoungNums = new int[size];
			numbers = new boolean[size * 2 + 1];
			visit = new boolean[size];
			win = 0;
			lose = 0;

			for (int i = 0; i < size; i++) {
				gyu[i] = Integer.parseInt(st.nextToken());
				numbers[gyu[i]] = true;
			}

			int cnt = 0;
			for (int i = 1; i < size * 2 + 1; i++) {
				if (!numbers[i])
					inyoungNums[cnt++] = i;
			}

			recur(0);

			answer.append('#').append(tc).append(' ').append(win).append(' ').append(lose).append('\n');
		} // end test-case

		System.out.println(answer);
	} // end main

	private static void recur(int cnt) {
		if (cnt == 9) {
			whoWin();
			return;
		}

		for (int i = 0; i < size; i++) {
			if(!visit[i]) {
				visit[i] = true;
				inyoung[cnt] = inyoungNums[i];
				recur(cnt+1);
				visit[i] = false;
			}
		}
	}

	private static void whoWin() {
		int gy = 0, iy = 0;

		for (int i = 0; i < size; i++) {
			if (gyu[i] > inyoung[i])
				gy += gyu[i] + inyoung[i];
			else
				iy += gyu[i] + inyoung[i];
		}

		if (gy > iy)
			win++;
		else if (gy < iy)
			lose++;
	}

}