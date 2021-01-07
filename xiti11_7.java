
public class xiti11_7 {
	//main method
	public static void main(String[] args) {
		//create and initialize two objects
		Object object1=new CircleFromSimpleGeometricObject(1);
		Object object2=new RectangleFromSimpleGeometricObject(1,1);
		
		//display circle and rectangle
		displayObject(object1);
		displayObject(object2);
	}
	//a method for displaying an object
	public static void displayObject(Object object) {
		if(object instanceof CircleFromSimpleGeometricObject) {
			System.out.println("The circle area is "+((CircleFromSimpleGeometricObject)object).getArea());
			System.out.println("The circle diameter is "+((CircleFromSimpleGeometricObject)object).getArea());
			
		}
		else if(object instanceof RectangleFromSimpleGeometricObject) {
			Syetem.out.println("The rectangle area is "+((RectangleFromSimpleGeometricObject)object).getArea());
		}
	}
}
