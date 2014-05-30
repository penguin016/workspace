import java.awt.Graphics;
import java.awt.Polygon;


public class x2 extends AbstractDrawFunction {
	
	Polygon p = super.getP();
	public x2(){
		super();
	}
	
	double f(double x){
		return 0.1*x*x;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawPolyline(p.xpoints, p.ypoints, p.xpoints.length);
		System.out.println(p.xpoints.length);
	}
}
