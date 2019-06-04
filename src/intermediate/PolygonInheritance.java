package intermediate;

public class PolygonInheritance {

	public static void main(String[] args) {
//		Rectangle rect = new Rectangle();
//		rect.setValues(10, 12);
//		double area= rect.calculateArea();
//		System.out.println("The area is of the Rectangle is  " + area);
//		
//		
//		Triangle tri = new Triangle();
//		tri.setValues(10, 12);
//		double area1 = tri.calculateArea();
//		System.out.println("The area is of the triangle is " + area1);
		
		
		
		Polygon poly = new Polygon();
		Polygon poly1 = new Triangle();
		poly1.setValues(10, 14);
		System.out.println(poly1.calculateArea());
	}

}
