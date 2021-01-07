import java.util.Scanner;
import java.math.*;
public class TWOCIRCLES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double r1,r2,x1,y1,x2,y2,m,n;
		
		System.out.print("Enter circle1's center x-,y-coordinates, and radius: ");
		x1=input.nextDouble();
		y1=input.nextDouble();
		r1=input.nextDouble();
		
		System.out.print("Enter circle2's center x-,y-coordinates, and radius: ");
		x2=input.nextDouble();
		y2=input.nextDouble();
		r2=input.nextDouble();
		
		m=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		n=Math.abs(r1-r2);
		
		if(m<=n)
			System.out.println("circle2 is inside circle1");
		else if(m<=r1+r2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlop circle1");
	}

}
