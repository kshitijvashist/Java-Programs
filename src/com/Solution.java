package problems.kshitij.string;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		int len=A.length()+B.length();
		System.out.println(len);

		if(A.charAt(0)>B.charAt(0))
			System.out.println("Yes");
		else
			System.out.println("No");

		String firstDigChar=A.charAt(0) +"";firstDigChar=firstDigChar.toUpperCase();
		String secondDigChar=B.charAt(0) +"";secondDigChar=secondDigChar.toUpperCase();

		String finalStr="";

		finalStr=firstDigChar+"";

		for(int i=0;i<A.length();i++)
		{
			if(i==0)
				continue;
			finalStr=finalStr+A.charAt(i);
		}
		finalStr=finalStr+" "+secondDigChar;

		for(int i=0;i<B.length();i++)
		{
			if(i==0)
				continue;
			finalStr=finalStr+B.charAt(i);
		}
		System.out.println(finalStr);
	}
}
