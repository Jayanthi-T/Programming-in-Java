class outer{
int x=10;
 class inner{
  int y=25;
}
}
public class inner{
public static void main(String[] args)
{
  outer out=new outer();
  outer.inner in=out.new inner(); 
  System.out.println("Sum of x in outer class and y in inner is : ");
  System.out.println(out.x+in.y);
}
}
  
