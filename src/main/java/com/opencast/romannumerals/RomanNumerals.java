package com.opencast.romannumerals;

public class RomanNumerals {

	public static String convert(int decimal) {

		String a = "I";
		String b = "V";
		String c = "X";
		String d = "L";
		String e = "C";
		String f = "D";
		String g = "M";
		StringBuilder sb = new StringBuilder();
		
		
		while (decimal >= 1000){
			sb.append(g);
			decimal -=1000;
		}
		
		
		while (decimal >= 900){
			sb.append(e);
			sb.append(g);
			decimal -=900;
		}
		
		while (decimal >= 400){
			sb.append(e);
			sb.append(f);
			decimal -=400;
		}
		
		while (decimal >= 100){
			sb.append(e);
			decimal -=100;
		}
		
		while (decimal >= 50){
			sb.append(d);
			decimal -=50;
		}
		
		while (decimal >= 40){
			sb.append(c);
			sb.append(d);
			decimal -=40;
		}
		
		while (decimal >= 10) {
			sb.append(c);
			decimal -= 10;
		}
		
		while (decimal >= 9){
			sb.append(a);
			sb.append(c);
			decimal -=9;
		}
		
		while (decimal >= 5) {
			
			sb.append(b);
			decimal -= 5;

		}
		while (decimal >= 4) {
			sb.append(a);
			sb.append(b);
			decimal -= 4;
		}
		while (decimal >=1)	{
		 
			sb.append(a);
			decimal -= 1;
		}

		return sb.toString();
	}

}
