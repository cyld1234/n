import java.util.Scanner;
public class µãÈý½ÇÐÎ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x,y,Fx;
		System.out.print("Enter a point's x- and y-coordinate: ");
		x=input.nextDouble();
		y=input.nextDouble();
		
		Fx=-1/2*x+100;
		if(x<=200&&x>=0&&y>=0&&y<=Fx)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
		
	}

}
