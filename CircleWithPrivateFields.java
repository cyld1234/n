
public class CircleWithPrivateFields {
	
	//the radius of the circle
	private double radius=1;
	//the radius of the circle
	private static int numberOfObjects=0;
	
	//the number of objects created
	public CircleWithPrivateFields() {
		numberOfObjects++;
	}
	
	//construct a circle with a apecified radius
	public CircleWithPrivateFields(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	
	//return radius
	public double getRadius() {
		return radius;
	}
	
	//set a new radius
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	//return numberOfObjects
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	//return the area of this circle
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
