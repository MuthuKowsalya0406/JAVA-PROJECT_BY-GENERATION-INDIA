package MyFirstVariableNaming;
import java.util.Scanner;
public class amCircle {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the diameter of the Circle:");
    double diameter = input.nextDouble();
    float pi=3.14159265359f;
    double radius = diameter/2.0;
    double area =(int)pi*radius;
   int perimeter = (int) (2*pi*radius);
    System.out.println("The area of the Circle:"+area);
    System.out.println("The perimeter of the circle:"+perimeter);
 
	}

}

