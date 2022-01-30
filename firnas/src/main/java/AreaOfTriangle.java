import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		System.out.println("enter the base of a triangle");
		Scanner Scanner=new Scanner(System.in);
		int base=Scanner.nextInt();
		System.out.println("enter the height of a triangle");
		int height=Scanner.nextInt();
		int area=(base*height)/2;
		System.out.println("area of triangle is"+area);
		
	}

}
