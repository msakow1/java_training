package point.sandbox;
public class MyFirstProgram {
	public static void main(String[] args) {

		System.out.println("Hello world");
		/*
		 Point p1 = new Point(1,1);
		 Point p2 = new Point(3,5);
		*/
		TwoPoints p1p2 = new TwoPoints(1,1,2,1);
		System.out.println("Distance between point 1 (x = " + p1p2.x1 + ", y = " + p1p2.y1 + ") and point 2 (x = " + p1p2.x2 +", y = " + p1p2.y2 + ") is equal " + p1p2.distance());
	}

}