package basic.java.programs;

import java.util.Scanner;

public class First_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("hi");
		int a1=500;
		short s = 10;
		byte b1=30;
		long l=70000+ (15 * a1)+ s + b1;
		System.out.println(l);
		long p= 100;
		double k= p / 0.453592237;
		System.out.println(k);
		
		int value=1;
		if(value ==1)
			System.out.println("value is equal to 1");
		if(value==1)
			System.out.println("value is equal to 1");
		else
			System.out.println("value i snot equal to 0");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");

		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'A':
			System.out.println("Apple");
			break;
		case 'b':
		case 'B':
			System.out.println("Banana");
			break;
		case 'c':
		case 'C':
			System.out.println("Cherry");
			break;
		case 'd':
		case 'D':
			System.out.println("Dragon fruit");
			break;
		case 'e':
		case 'E':
			System.out.println("ElderBerry");
			break;
			
			default:
				System.out.println("Not in fruit basket");
		}
		
	
	
		
		
	}
	

}
