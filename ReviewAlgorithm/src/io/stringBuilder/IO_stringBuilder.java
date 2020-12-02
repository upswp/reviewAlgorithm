package io.stringBuilder;

public class IO_stringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("SSAFY").append("!!");
		System.out.println(sb.toString()); // Hello SSAFY!!
		
		sb.setLength(sb.length()-2);
		System.out.println(sb.toString()); // Hello SSAFY!
	}
}
 