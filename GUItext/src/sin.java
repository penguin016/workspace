import java.awt.Graphics;
import java.awt.Polygon;


public class sin extends AbstractDrawFunction{

Polygon p = super.getP();
	
	public sin(){
		super();
	}
	
	double f(double x){
		return Math.sin(x);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawPolyline(p.xpoints, p.ypoints, p.xpoints.length);
		System.out.println(p.xpoints.length);
	}
}
