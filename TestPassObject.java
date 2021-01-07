
public class TestPassObject {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a circle object with radius 1
		CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(1);
		
		//print areas for radius 1,2,3,4,and5
		int n=5;
		printArea(myCircle,n);
		
		//see myCircle.radius and times
		System.out.println("\n"+"Radius is "+myCircle.getRadius());
		System.out.println("n is "+n);
	}
	
	//print a table of areas for radius
	public static void printAreas(
			CircleWithPrivateFields c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}

}
