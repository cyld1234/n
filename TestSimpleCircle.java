public class TestSimpleCircle { 
	/** Main method */ 
	public static void main(String[] args) { 
		// Create a circle with radius 1
		SimpleCircle circlel=new SimpleCircle(); 
		System.out.println("The area of the circle of radius "
		 +circlel.radius + "is " + circlel.getArea()); 
		
		// Create a circle with radius 25
		SimpleCircle circ1e2 =new SimpleCircle(25);
		System.out.println("The area of the circle of radius "
			+ circ1e2.radius + " is " + circ1e2.getArea());

		// Create a circle with radius 125
		SimpleCircle circ1e3 =new SimpleCircle(125);
		System.out.println("The area of the circle of radius "
		  + circ1e3.radius + " is " + circ1e3.getArea());
		
		// Modify circle radius
		circ1e2.radius=100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius "
		  + circ1e2.radius + " is " + circ1e2.getArea());
	}
 }

// Define the circle class with two constructors
class SimpleCircle {
 double radius;

 /** Construct a circle with radius 1 */
 SimpleCircle() {
 radius=1;
 }

 /** Construct a circle with a specified radius */
 SimpleCircle(double newRadius) {
 radius = newRadius;
}

 /** Return the area of this circle */
 double getArea() {
 return radius *radius * Math.PI;
 }

 /** Return the perimeter of this circle */
 double getPerimeter() {
 return 2 *radius * Math.PI;
 }

 /** Set a new radius for this circle */
 void setRadius(double newRadius) {
	 radius = newRadius;
 	}
 }