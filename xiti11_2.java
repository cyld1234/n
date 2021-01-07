
public class xiti11_2 {
	 
	private double radius;
	public xiti11_2() {
	}
	public xiti11_2(double radius) {
		this.radius=radius;
	}
	public xiti11_2(double radius,String color,boolean filled) {
		this.radius=radius;
		setColor(color);
		setFilled(filled);
	}
	//return radius
	private void setFilled(boolean filled) {
		// TODO Auto-generated method stub
		
	}
	private void setColor(String color) {
		// TODO Auto-generated method stub
		
	}
	public double getRadius() {
		return radius;
	}
	//set a new radius
	public void setRadius(double radius) {
		this.radius=radius;
	}
	//return area
	public double getArea() {
		return radius *radius*Math.PI;
	}
	//return diameter
	public double getDiameter() {
		return 2*radius;
	}
	//return perimeter
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	//print the circle info
	public void printCircle() {
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
	private String getDateCreated() {
		// TODO Auto-generated method stub
		return null;
	}
}












