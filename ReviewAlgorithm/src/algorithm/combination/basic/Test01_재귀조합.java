package algorithm.combination.basic;

import java.util.Arrays;
/**
 * 조합
 * @author Park Sangwoo
 * @since 2020-11-03
 */
public class Test01_재귀조합 {
	
	static String[] data = {"A","B","C","D","E"};
	static String[] result = new String[3];
 	public static void main(String[] args) {
 		combination(0,0);
	}
 	
 	public static void combination(int index, int start) {
 		if(index == 3) {
 			System.out.println(Arrays.toString(result));
 			return;
 		}
 		for (int i = start; i < data.length; i++) {
 			result[index] = data[i];
			combination(index+1, i+1);
		}
 	}
}
