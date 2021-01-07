import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入三条边长： ");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int m=a+b+c;
		
		
		if((a<b+c)&&(b<a+c)&&(c<a+b))
			System.out.println("周长： "+m);
		else
			System.out.println("输入值不合法");
	}

}
