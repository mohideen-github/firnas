import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("enter the radius");
		Scanner Scanner= new Scanner(System.in);
		double radius=Scanner.nextDouble();
		double area=Math.PI*radius*radius;
		double circumference=2*Math.PI*radius;
		System.out.println("the area of circle is"+area);
		System.out.println("the circumference of a circle is"+circumference);
		
		
		
		
	}

}
