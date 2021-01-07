
public class TotalArea {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare circleArray
		CircleWithPrivateFields[] circleArray;
		
		//create circleArray
		circleArray=createCircleArray();
		
		//print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
	//create an array of circle objects
	public static CircleWithPrivateFields[] createCircleArray() {
		CircleWithPrivateFields[] circleArray=
				new CircleWithPrivateFields[5];
		
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=
			  new CircleWithPrivateFields(Math.random()*100);
		}
		//return circle array
		return circleArray;
		}
	
	public static void printCircleArray(CircleWithPrivateFields[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30s%-15\n","the total area of circle is",sum(circleArray));
			
		}
		System.out.println("---------------");
		
		//compute and display the result
		System.out.printf("%-30s%-15\n", "the total area of circle is",sum(circleArray));
	}
	public static double sum(CircleWithPrivateFields[] circleArray) {
		//Initalize sum
		double sum=0;
		
		//add areas to sum
		for(int i=0;i<circleArray.length;i++) 
			sum+=circleArray[i].getArea();
			return sum;
		
	}
}
