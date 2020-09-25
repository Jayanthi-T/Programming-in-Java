import java.util.*
public class Scannerdemo{

public static void main(String args[]){
String s="Hello world!";
System.out.println(s);
//create a new scanner with specified string object
Scanner scanner=new.Scanner(s);

//find the next token and print it
System.out.println(first+""+scanner.next());

//find the next token and print it
System.out.println(second+""+scanner.next());

//close scanner
scanner.close();
}
}

Output:

Hello world!
firstHello
Secondworld!
