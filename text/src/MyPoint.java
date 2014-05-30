
public class MyPoint {
	private double x;
	private double y;

	public MyPoint(double x,double y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public MyPoint(){
		this(0.0,0.0);
	}
	
	public double distance(MyPoint x1,MyPoint x2){
		return Math.sqrt((x1.x-x2.x)*(x1.x-x2.x)+(x1.y-x2.y)*(x1.y-x2.y));
	}
	
	public double distance(double x1,double y1,double x2,double y2){
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
}
