import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class SmallLattice extends JPanel{
	JLabel jlabel = new JLabel();
	boolean isNum;
	private int[] num = {1,2,3,4,5,6,7,8,9};
    private int isHard = 0;
	public SmallLattice() {
		int temp = num[(int)(Math.random()*9)];
		double temp1 = Math.random();
		if(temp1 < 0.4){
			jlabel.setText(Integer.toString(temp));
			isNum = true;
			add(jlabel);
		    setBackground(Color.LIGHT_GRAY);
		}
		else{
			jlabel.setText("");
			isNum = false;
			add(jlabel);
		}
		setBorder(new LineBorder(Color.GRAY));
	}
	public int getIsHard() {
		return isHard;
	}
	public void setIsHard(int isHard) {
		this.isHard = isHard;
	}
}
