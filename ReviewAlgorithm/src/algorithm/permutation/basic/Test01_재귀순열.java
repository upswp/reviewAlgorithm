package algorithm.permutation.basic;

import java.util.Arrays;
/**
 * 순열 : 순서대로 뽑아서 줄을 세우는 형태로 중복이 있지 않음.
 * @author Park Sangwoo
 * @since 2020-11-03
 */
public class Test01_재귀순열 {
	
	static String[] data = {"A","B","C","D","E"};
	static boolean[] used = new boolean[data.length];
	static String[] result = new String[2];
	static int totalCount;
	public static void main(String[] args) {
		permutation(0);
		System.out.println(totalCount);		// 5 * 4 = 20
	}
	
	public static void permutation(int index) {
		if(index == 2) {
			++totalCount;
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i = 0; i <data.length; i++) {
			if(!used[i]) {					// 미사용 상태의 카드를 찾으면
				used[i] = true;				// 사용상태로 전환하고
				result[index] = data[i];	// 결과값해당 인덱스에 해당 값을 넣어주고
				permutation(index+1);		// 재귀를 이용하여 순환
				used[i] = false;			// 사용상태를 반환한다. 
			}
		}
	}
}
