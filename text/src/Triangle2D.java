import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
		
	public Triangle2D() {
		p1 = new MyPoint();
		p2 = new MyPoint(1.0,1.0);
		p3 = new MyPoint(2.0,5.0);	
	}
	
	public Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

    public double getArea() {
    	double side1 = p1.distance(p1, p2);
    	double side2 = p1.distance(p1, p3);
    	double side3 = p1.distance(p2, p3);
     	double s = (side1+side2+side3)/2;
    	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    
    public double getPerimeter() {
    	return p1.distance(p1, p2)+p1.distance(p1, p3)+p1.distance(p2, p3);
    }
	
	public boolean contains(MyPoint p) {
    	Point2D.Double point2D1 = new Point2D.Double(p1.getX(), p1.getY());
    	Point2D.Double point2D2 = new Point2D.Double(p2.getX(), p2.getY());
    	Point2D.Double point2D3 = new Point2D.Double(p3.getX(), p3.getY());
    	Point2D.Double point2Dp = new Point2D.Double(p.getX(), p.getY());
    	
    	Line2D.Double line2D1 = new Line2D.Double(point2D1, point2D2);
    	Line2D.Double line2D2 = new Line2D.Double(point2D2, point2D3);
    	Line2D.Double line2D3 = new Line2D.Double(point2D3, point2D1);
    	Line2D.Double line2D4 = new Line2D.Double(point2D1, point2Dp);
    	Line2D.Double line2D5 = new Line2D.Double(point2D2, point2Dp);
    	Line2D.Double line2D6 = new Line2D.Double(point2D3, point2Dp);
    	
    	boolean boo1 = line2D1.intersectsLine(line2D6);
    	boolean boo2 = line2D2.intersectsLine(line2D4);
    	boolean boo3 = line2D3.intersectsLine(line2D5);
    	
    	if(boo1 == false&&boo2 == false&&boo3 == false)
    		return true;
    	else
    		return false;
    }
    
    public boolean contains(Triangle2D t) {
    	boolean bool1 = this.contains(t.p1);
    	boolean bool2 = this.contains(t.p2);
    	boolean bool3 = this.contains(t.p3);
    	if(bool1 == true&&bool2 == true&&bool3 == true)
    		return true;
    	else 
    		return false;
    }
    
    public boolean overlaps(Triangle2D t) {
    	boolean bool1 = this.contains(t);
    	boolean bool2 = t.contains(this);
    	if(bool1 == true&&bool2 == true)
    		return true;
    	else 
    		return false;
    }

	public MyPoint getP1() {
		return p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
}
