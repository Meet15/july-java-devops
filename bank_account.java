package basic.java.programs;

public class bank_account {
private  long acno=123455789;
private double balance=50.0;
private String name="Meet";
private String email="mapatel985@gmail.com";
private int phone =566788989;



public long getAcno() {
	return acno;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public void deposit(double amount) {

	
	if( amount>50) {
		System.out.println("deposit must be less than 50");
	}
	else {
		
	double finalbalance=(amount + balance); 
	System.out.println("final balance=" +finalbalance);
	}
	
} 
public void withdraw(double withdrawamt) {
	if(withdrawamt > balance)
	{
	System.out.println("Insufficient funds");
	}
	else {
		balance = balance - withdrawamt;
	//double finalamt=balance - withdrawamt;
	System.out.println( "Money withdrawn="+ withdrawamt);
	System.out.println("Balance=" +balance );
	}
}
 public void balance() {
	 System.out.println("Name=" + name);
	 System.out.println("Account number="+acno);
	 System.out.println("email="+ email);
	 System.out.println("phone="+phone);
	 System.out.println( "current balance=" +balance);
	 
}
}

