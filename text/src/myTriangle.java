
public class myTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2.0),new MyPoint(4.2,3.0),new MyPoint(5.0,3.5));
		System.out.println(t1.getPerimeter());
		System.out.println(t1.getArea());
		System.out.println(t1.contains(new MyPoint(3.0,3.0)));
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9,2.0),new MyPoint(4.0,1.0),new MyPoint(1.0,3.4))));
		System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2.0,5.5),new MyPoint(4.0,-3.0),new MyPoint(2.0,6.5))));
      
	}

}
