public class TestCircle {
	/**Main method */
	public static void main(String[] args) {
		//create a circle with radius 1	
		circle circle1=new circle();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		
		//Create a circle with radius 25
		circle circle2=new circle(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		
		//Create a circle with 125
		circle circle3=new circle(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		
		//Modify circle radius
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	}
}

//Define the circle class with two constructors
class circle{
	double radius;
	
	/**Construct a circle with a specified radius */
circle(){
	radius=1;
}

/**Return the area of this circle */
circle(double newRadius){
	radius=newRadius;
}

/**Return the area of this circle */
double getArea() {
	return  radius*radius*Math.PI;
}

/**Return the perimeter of this circle */
double getPerimeter() {
	return 2*radius*Math.PI;

} 

/**Set a new radius for this circle */
void setRadius(double newRadius) {
	radius = newRadius;
	}
}