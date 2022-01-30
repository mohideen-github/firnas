import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		int temp;
		boolean isprime=true;
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=Scan.nextInt();
		Scan.close();
		for(int i=2;i<=num;i++) {
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				break;
				
				
			}
		}
		if(isprime) {
			System.out.println("is a prime number");
		}
			else 
			System.out.println("is not a prime number");
		
			}
		}
		
	


