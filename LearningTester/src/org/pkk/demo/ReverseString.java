package org.pkk.demo;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str="Prashant";
		int len=str.length();
		char []c=new char[len];
		for(int j=len-1,i=0;j>=0 ;j--,i++){
		    c[i]=str.charAt(j);
		}
		str=String.copyValueOf(c);
		char[] aa = c;
		System.out.println(str);
		System.out.println(aa);
		System.out.println(c);
		
		
		}
}
