import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    	Scanner sc = new Scanner(System.in);
   
      int n=sc.nextInt();
      int n1=n/100;
     int n2=n%100;
      int n3=n2/10;
      int n4=n2%10;
      
      System.out.print(n4);
      System.out.print(n3);
      System.out.print(n1);
  }
}