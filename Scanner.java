import java.util.Scanner;
public class Myclass{
public static void main(String args[]){
Scanner myobj=new Scanner(System.in);  //create scanner object
System.out.println("Enter Username:");
String username=myobj.nextLine();  //read user input
System.out.println("Username is: "+username);  //output user input
}
}

Input:
Enter Username:jaya
Output:
Username is jaya
