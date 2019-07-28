import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
       int number, square;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
		square = calsquare(number);
		System.out.println(square);
	}
	
	public static int calsquare(int num)
	{
		return num * num;
	}
}
