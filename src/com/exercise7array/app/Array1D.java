package com.exercise7array.app;

public class Array1D {

	public static void main(String[] args) {
		//Constants declaration
		//I want 10 element because it is a practice project
		final int ELEMENTES_ARRAY = 10;
		// Arrays declaration
		//1st way
		/*
		int[] intArray = new int[10];
		char[] charArray = new char[10];
		boolean[] boolArray = new boolean[10];
		double[] dbArray = new double[10];
		String[] strArray = new String[10];
		*/
		int[] intArray2 = {10, 20, 30, 40, 50, 60};
		char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
		boolean[] boolArray2 = {true, false, true, false, true};
		double[] dbArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] strArray2 = {"first", "second", "third", "fourth", "fitth"};
		
		for(int i=0; i<intArray2.length; i++)
		{
			System.out.println(intArray2[i]);
		}
		for(int i=0; i<charArray2.length; i++)
		{
			System.out.println(charArray2[i]);
		}	
		for(int i=0; i<boolArray2.length; i++)
		{
			System.out.println(boolArray2[i]);
		}
		for(int i=0; i<dbArray2.length; i++)
		{
			System.out.println(dbArray2[i]);
		}
		for(int i=0; i<strArray2.length; i++)
		{
			System.out.println(strArray2[i]);
		}
	}

}
