import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
    System.out.print(i);
    count++;
    if(count==3)
    {
        System.out.print(",");
        count=0;
    }
}
    }
}