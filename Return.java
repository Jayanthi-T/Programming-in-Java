class return{
public static void main(String args[]){
boolean t=true;
System.out.println("Before the return");
if(t)
return;
//compiler will bypass every statement
//after return
System.out.print("This won't execute");
}
}
