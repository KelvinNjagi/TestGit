package kelvinnjagi;
public classAssignment1{ 
	publicstaticvoidmain(String[]args){ 
	Triangletriangle = newTriangle(1,1.5,1);
	triangle.setColor("yellow");
	triangle.setFilled(true);

	System.out.println(triangle);
	System.out.println("Theareais"+triangle.getArea());
	System.out.println("Theperimeteris"+triangle.getPerimeter());
	System.out.println(triangle);
  }
}

public abstract classGeometricObject{
	privateS tringcolor="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
/**Construct a default geometric object*/
protectedGeometricObject(){
     dateCreated=newjava.util.Date();
}
/**Construct a geometric object with color and filled value*/
protected GeometricObject(String color,boolean filled){
	dateCreated=newjava.util.Date();
	this.color=color;
	this.filled=filled;
	}
	/**Return color*/
	public String getColor(){
	return color;
	}
	/**Set a new color*/
	public voidset Color(String color){
	this.color=color;
	}
	/**Returnfilled.Sincefilledisboolean,
	*thegetmethodisnamedisFilled*/
	public boolean isFilled(){
	return filled;
	}
	/**Set a new filled*/
	public void setFilled(boolean filled){
	this.filled=filled;
	}
	/**GetdateCreated*/
	publicjava.util.Date getDateCreated(){
	return dateCreated;
	}
	@Override 
	publicStringtoString(){
	return "createdon"+dateCreated+"\ncolor:"+color+"andfilled:"+filled;
	}
	/**AbstractmethodgetArea*/
	public abstract doublegetArea();
	/**AbstractmethodgetPerimeter*/
	publicabstractdoublegetPerimeter();
	}
	class Triangle extends GeometricObject{//Implement it
		
}

