class BreakDemo{
public static void main(String args[]){
boolean t=true;
first:
{
second:
{
third:
{
System.out.print("Before the break statement");

if(t)
break second;
System.out.println("This won't execute");
}
System.out.println("This won't execute");
}
System.out.println("This is out of second block");
}
}
}

Output:

This is out of second block
   
