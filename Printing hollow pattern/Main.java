import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		 for(int i=1; i<=N; i++)
    {
        for(int j=1; j<=N; j++)
        {
            if(i==1 || i==N || j==1 || j==N)
            {
                System.out.print("*");
            }
            else
            {
            System.out.print(" ");
            }
        }
        System.out.print("\n");
}
	}
}