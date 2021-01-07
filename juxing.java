import java.util.Scanner;
//import java.Math.*;
public class juxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		double a,b;
		
		System.out.print("Enter a point with two coordinates: ");
		a=input.nextInt();
		b=input.nextInt();
		
		if(Math.abs(a)<=5&&Math.abs(b)<=2.5)
			System.out.println("Point ("+a+","+b+") is in the rectangle");
		else
			System.out.println("Point ("+a+","+b+") is not in the rectangle");
	}

}
