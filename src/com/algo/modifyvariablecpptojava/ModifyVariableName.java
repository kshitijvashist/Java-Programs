package com.algo.modifyvariablecpptojava;

import java.util.Scanner;

public class ModifyVariableName {
	public static void main(String ...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input Variable Name");
		String inputString=sc.next();
		
		
		
		if(inputString.contains("_"))
			System.out.println(changeToJavaVariableName(inputString));
		
		else
			System.out.println(changeToCPPVariableName(inputString));
	}

	public static String changeToJavaVariableName(String input)
	{
		
		 String bufferString="";
			
		 for(int i=0;i<input.length();i++)
		 {
			 if(input.charAt(i)=='_')
			 {
				 bufferString=bufferString+Character.toUpperCase(input.charAt(i+1));
				 i=i+1;
				 continue;
			 }
			 
			 bufferString=bufferString+input.charAt(i);
		 }
		 return bufferString;
	}
	
	public static String changeToCPPVariableName(String input)
	{
		 String bufferString="";
		
		 for(int i=0;i<input.length();i++)
		 {
			 char character = input.charAt(i); // This gives the character 'a'
			 int ascii = (int) character;
			 if(ascii>=65 && ascii<=90)
			 {
				 bufferString=bufferString+"_"+Character.toLowerCase(input.charAt(i));
			 }
			 else
				 bufferString=bufferString+input.charAt(i);
		 }
		 
		 return bufferString;
	}
}
