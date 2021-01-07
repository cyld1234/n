import java.util.Scanner;
import java.math.*;
public class 几何两个矩形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x1,x2,y1,y2,h1,h2,w1,w2;
		System.out.print("Enter r1's center x-,y-coordinates,width,and height: ");
		x1=input.nextDouble();
		y1=input.nextDouble();
		w1=input.nextDouble();
		h1=input.nextDouble();
		
		System.out.print("Enter r2's center x-,y-coordinates,width,and height: ");
		x2=input.nextDouble();
		y2=input.nextDouble();
		w2=input.nextDouble();
		h2=input.nextDouble();
		
		 if(x1==x2&&y1==y2){            
		      if(w2<=(w1/2)&&h2<=(h1/2)){                
		         System.out.println("r2 is inside r1");            
		      }
		      else if(w2<=(w1/2)||h2<=(h1/2)){                
		         System.out.println("r2 overlaps r1");            
		            }
		      else{                
		              System.out.println("r1 is inside r2");                
		             }              
		   }
		 else if(Math.abs(x1-x2)<=(w1/2+w2/2)||Math.abs(y1-y2)<=(h1-h2)){                 
		         System.out.println("r2 overlap r1");             
		         }            
		         else {                
		              System.out.println("r2 does not overlap r1");           
		         }

	}

}
