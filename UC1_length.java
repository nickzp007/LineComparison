package com.bridgelabz;

import java.util.*;
public class UC1_length {
	public static void main(String[] args) {
		
		int x1, x2, y1, y2;
		double length;
		
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first two co-ordinates:");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter second two co-ordinates:");
		x2=sc.nextInt();
		y2=sc.nextInt();
		length=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.println("Length of the line:" + length);
	}
}

