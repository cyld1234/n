
public class xiti11_5 {
//main method
	public static void main(String[] args) {
		//display circle and rectangle properties
		displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	}
	//display geometric object properties
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+".Color is "+object.getColor());
	}
}
