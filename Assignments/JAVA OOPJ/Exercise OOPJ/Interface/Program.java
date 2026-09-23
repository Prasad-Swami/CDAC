package in.cdac.exercises;

public class Program {
	public static void main(String[] args) {
		EquilatralTraingle tri = new EquilatralTraingle(40);
		Square sq = new Square(20);
		
//		System.out.println(tri.getNumSides());
//		System.out.println(tri.getSideLength());
//		System.out.println(tri.getPerimeter());
//		System.out.println(tri.getInteriorAngle());
//		
//		System.out.println(sq.getNumSides());
//		System.out.println(sq.getSideLength());
//		System.out.println(sq.getPerimeter());
//		System.out.println(sq.getInteriorAngle());

		
		System.out.println("Details of Equilatral Triangle: ");
		tri.display();
		System.out.println("\nDetails of Square: ");
		sq.display();
		
		RegularPolygon arr[] = { tri, sq };
		System.out.println("The Total Element in array: ");
		
		RegularPolygon.totalSides(arr);
	}
}
