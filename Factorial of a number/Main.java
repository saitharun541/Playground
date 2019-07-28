import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
         int n, fact = 1;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      if (n < 0)
         System.out.println("Number should be non-negative.");
      else
      {
         for (int i = 1; i <= n; i++)
            fact = fact*i;
     
         System.out.println(fact);
      }
	}
}
