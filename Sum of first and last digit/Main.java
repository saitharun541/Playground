import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int last=n%10;
		while(n>10)
		n=n/10;
		int sum=n+last;
		System.out.println(sum);
	}
}