import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;


public abstract class AbstractDrawFunction extends JPanel {
	
	private Polygon p = new Polygon();
	
	protected AbstractDrawFunction() {
		drawFunction();
	}

	abstract double f(double x);
	
	private void drawFunction() {
		// TODO Auto-generated method stub
		for(int x = -100;x <= 100;x++){
			p.addPoint(x+200, 200-(int)f(x));
		}
	}
	
	protected void paintComponent(Graphics g) {
		
	}

	public Polygon getP() {
		return p;
	}

	public void setP(Polygon p) {
		this.p = p;
	}

}
