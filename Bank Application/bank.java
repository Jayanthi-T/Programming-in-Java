/*
Name     :JAYANTHI T
Roll No. :1817119
Topic    :Developing a Basic Banking Application in Java
*/
import  java.util.Scanner;//Built-in package is used here
class bank{
	static int accountsBalance=0;
public static void main(String arg[])
{
Scanner input = new Scanner(System.in);
int userInput ;
System.out.println("/**************************************************************************/\n");
System.out.println("Welcome ^_^ to bank with MoneyBags!\nYou have successfully logged in.\n");
System.out.println("/**************************************************************************/");
for(;true;){
System.out.println("\nSelect the service you needed:");
System.out.println("=============================================================================");
System.out.println("(1): My Profile Details");
System.out.println("(2): Deposit Info");
System.out.println("(3): Withdrawal Info");
System.out.println("(4): Balance Enquiry");
System.out.println("(5): Contact Us");
System.out.println("(6): Logout");
System.out.println("----------------------------------------------------------------------------");
 userInput = input.nextInt();

switch(userInput)
{
	case 1:
	profile();
	break;
	case 2:
	deposit();
	break;
	case 3:
	withdraw();
	break;
	case 4:
	balance();
	break;
	case 5:
	contactus();
	break;
	case 6:
	logout();
	break;
	default:
	System.out.println("ERROR ! Invalid input");
}
}
}
//Interface is used
interface Profile{
		void MyProfile();
	}
 interface BankInfo extends Profile{
		public void DisplayProfile();
	}

public static void profile()
{
	BankInfo userProfile=new BankInfo(){
	public void MyProfile(){
		System.out.println("Account number:MNB8673003\nAccount-holder's name:NewUser@Money-Bags\nAccount type: Savings aacount");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
	public void DisplayProfile(){
		System.out.println("Bank name: Money Bags\n 19,Money Street,Cash city.\nBranch: Cash city branch\nIFSC code:MNBN0001234\n");
	}
	};
userProfile.MyProfile();
userProfile.DisplayProfile();
}

public static void deposit(){
	class Save{//Method overloading is used
		void savingsint(int x){
			System.out.println("Your deposit of "+x+" was successfull");
		}
		void savingsdouble(double x){
			System.out.println("Your deposit of "+x+" was successfull");
		}
	}

	Save obj=new Save();//Constructor is used
	obj.savingsint(80000);
	obj.savingsdouble(800.75);
	long y=80000;
	long z=800,vary=0;
	vary=y+z+200;//As 200 is minimum balance to be maintained by user
	 bank.accountsBalance=(int)vary;
	
	System.out.println("Your balance is:"+accountsBalance);
}
	
public static void withdraw(){

class InvalidAmount extends Exception{  //User Defined Exception Handling is used
 InvalidAmount(String s){  
  super(s);  
 }  
}  
 	class validating{
    public void validatinglong(long amount)throws InvalidAmount{  
     if(amount>30000)  
      throw new InvalidAmount(amount+" cannot be withdrawn as it exceeds minimum withdrawal limit.");  
  	 else if(amount<200){
  	 	throw new InvalidAmount(amount+" cannot be withdrawn.");  
  	 }
     else  {
      System.out.println("Your account is debited with "+amount);
     bank.accountsBalance=81000;
      bank.accountsBalance-= amount;
      System.out.println("Your balance is "+accountsBalance);
  }
   }  
}
	try{  
		System.out.println("Enter the amount you want to withdraw:");
		Scanner cashToWithdraw= new Scanner(System.in);
		int withdrawAmount = cashToWithdraw.nextInt();

		validating v=new validating();
      v.validatinglong(withdrawAmount);  
      }catch(Exception m){System.out.println("Minimum Withdrawal amount is 30000 per day.\n"+m);} 
       
  
}
public static void balance(){
//Exception handling is used
try{
	System.out.println("Enter your customerID to view your balance:");
Scanner customerid = new Scanner(System.in);
int customerID = customerid.nextInt();

	if(customerID<=110){
	   
		System.out.println("Your account balance is "+accountsBalance);}
	else
		System.out.println("Check your customerID.");
}catch(Exception e){
	System.out.println("Sorry,your customerID is not valid!");
}
}

public static void contactus()
{
class Bank{//Multilevel Inheritance is used
		public void Contact(){
			System.out.println("\nMail us on :");
			System.out.println("===========");
			System.out.println("bankingqueries@gmail.com");
		}
	}
	class Manager extends Bank{
		public void Contact(){
			System.out.println("\nContact our Manager on:");
			System.out.println("=======================");
			System.out.println("themanager@gmail.com");
		}
	}
	class Deactivate extends Manager{
		public void Contact(){
			System.out.println("\nTo deactivate your account: \nMail your account number to: \n============================");
			System.out.println("deactivateme@gmail.com\n");
		}
	}
	Bank a=new Bank();//Method overriding is used
	Bank b=new Manager();
	Bank c=new Deactivate();
	a.Contact();
	b.Contact();
	c.Contact();
}
public static void logout()
{
	System.out.println("Thanks for banking with MoneyBags!\nYou have logged out Successfully *_*.");
System.exit(6);
}
}

