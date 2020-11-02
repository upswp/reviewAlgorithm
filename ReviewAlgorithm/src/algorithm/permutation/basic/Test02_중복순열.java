package algorithm.permutation.basic;

import java.util.Arrays;
/**
 * 중복순열 : 중복이 허용되는 모든 수
 * @author Park Sangwoo
 * @since 2020-11-03
 */
public class Test02_중복순열 {
	
	static String[] data = {"A","B","C","D","E"};
	static boolean[] used = new boolean[data.length];
	static String[] result = new String[2];
	static int totalCount;
	public static void main(String[] args) {
		permutation(0);
		System.out.println(totalCount);		//	5 * 5 = 25
	}
	
	public static void permutation(int index) {
		if(index == 2) {
			++totalCount;
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i = 0; i <data.length; i++) {
				result[index] = data[i];	// 결과값해당 인덱스에 해당 값을 넣어주고
				permutation(index+1);		// 재귀를 이용하여 순환
		}
	}
}
