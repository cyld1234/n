public class xiti11_1 {
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**construct a default geometric object*/
	public xiti11_1() {
		dateCreated=new java.util.Date();
	}
	
	//construct a geometric object with specified color and filled value
	public xiti11_1(String color,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	//return color
	public String getColor() {
		return color;
	}
	//set a new color 
	public void getColor(String color) {
		this.color=color;
	}
	//return filled.Since filled is boolean its getter method is named isfilled
	public boolean isFilled() {
		return filled;
	}
	//set a new filled
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	//get dateCreated
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	//return a string representation of this object
	public String toString() {
		return "created on "+ dateCreated+"\ncolor: "+color+" and filled: "+filled;
	}
}

