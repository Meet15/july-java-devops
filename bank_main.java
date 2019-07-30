package basic.java.programs;

import java.util.Scanner;

public class bank_main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank_account bac=new bank_account();
	
		

		sc = new Scanner(System.in);
		System.out.println("1.Account balance");
		System.out.println("2.Deposit money");
		System.out.println("3.withdraw money");
		System.out.println("4.Exit");
		char ch4;
		
		System.out.println("enter your choice");
	    ch4=sc.next().charAt(0);
	    switch(ch4)
		{
		case '1':
			
			bac.balance();
		
			
			break;
		case '2':
			System.out.println("how much you want to deposit?");
			double depo=sc.nextDouble();
			bac.deposit(depo);
			break;
		case '3':
			
			System.out.println("how much you want to withdraw?");
			double with=sc.nextDouble();
			bac.withdraw(with);
			break;
			
		case '4':
			System.exit(0);
			break;
		default:
			System.out.println("wrong input");
		
			
		
	}

}
}

