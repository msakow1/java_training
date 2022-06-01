package point.sandbox;
public class MyFirstProgram {
	public static void main(String[] args) {

		System.out.println("Hello world");
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,5);
		System.out.println("Distance between point 1 (x = " + p1.x + ", y = " + p1.y + ") and point 2 (x = " + p2.x +", y = " + p2.y + ") is equal " + distance(p1,p2));
	}
	public static double distance(Point p1, Point p2){
		return Math.sqrt(Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.y),2));
	}

}