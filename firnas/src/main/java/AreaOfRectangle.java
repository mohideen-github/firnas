import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner Scanner= new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		double length=Scanner.nextDouble();
		System.out.println("enter the width of rectangle");
		double width=Scanner.nextDouble();
		double area=length*width;
		System.out.println("area of rectanle is"+area);
		
	}

}
