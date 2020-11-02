package algorithm.subset.basic;

import java.util.Arrays;
/**
 * 부분집합
 * @author Park Sangwoo
 * @since 2020-11-03
 */
public class Test01_부분집합 {
	static String[] data = {"A","B","C","D","E"};
	static String[] result = new String[4];
	static boolean[] select = new boolean[4];
	
	public static void main(String[] args) {
		powerSet(0);
	}

	static void powerSet(int index) {
		if(index == 4) {
			System.out.println(Arrays.toString(select));
			return;
		}
		
		select[index] = false;
		powerSet(index+1);
		select[index] = true;
		powerSet(index+1);
		
	}

}
