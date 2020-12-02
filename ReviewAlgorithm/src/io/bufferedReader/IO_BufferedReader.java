package io.bufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_BufferedReader {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		System.out.println(a);
		char[] ch = br.readLine().toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		System.out.print(i+"//"+j);
		
	}
}
