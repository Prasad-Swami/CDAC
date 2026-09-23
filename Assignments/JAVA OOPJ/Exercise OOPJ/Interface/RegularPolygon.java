package in.cdac.exercises;

public interface RegularPolygon {
	 int getNumSides();
	 int getSideLength();
	 
	 static int totalSides(RegularPolygon[] arr) {
		 int size = arr.length;
		 int total = 0;
		 for(int itmp = 0; itmp < size; itmp++) {
			 total += arr[itmp].getNumSides();
			 //Figuring out how can I do that?
		 }
		 
		 System.out.println(total);
		 return total;
	 }
	 
	 default int getPerimeter() {
		return getNumSides()*getSideLength();
	 }
	 
	 default double getInteriorAngle() {
		 double rad = (getNumSides() - 2)*Math.PI/getNumSides();
		 return rad * 180/Math.PI;
	 }
	 
	 default void display() {
		 System.out.println("Number of Sides: " + getNumSides());
		 System.out.println("Length of Sides: " + getSideLength());
		 System.out.println("Permeter: " + getPerimeter());
		 System.out.println("Interior Angle: " + getInteriorAngle());
		 //System.out.println("The total side of all elements is: " + totalSides());
	 }
}

class EquilatralTraingle implements RegularPolygon {
	
	private int sideLength;

	
	//Constructor
	EquilatralTraingle(int sideLength){
		this.sideLength = sideLength;
	}
	
	
	@Override
	public int getNumSides() {
		return 3;
	}
	
	@Override
	public int getSideLength() {
		return sideLength;
	}
	
} 

class Square implements RegularPolygon{
	private int sideLength;
	
	//Constructor
	Square(int sideLength){
		this.sideLength = sideLength;
	}
	
	@Override
	public int getNumSides() {
		return 4;
	}
	
	@Override
	public int getSideLength() {
		return sideLength;
	}
	
} 
