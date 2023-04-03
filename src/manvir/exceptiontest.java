package arrayandexcep;

import java.util.Scanner;

public class exceptiontest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ypur number");
		int a,b,c;
		try
		{
			a=scanner.nextInt();
			b=scanner.nextInt();
			
			c=a/b;
			
			System.out.println(c);
			}
			catch (Exception e) {
				System.out.println("please do proper value");
			}
		
		}

}
