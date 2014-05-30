import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;


public class BallControl extends JPanel {
	private Ball ball = new Ball();
	private JButton jbtSuspend = new JButton("Supend");
	private JButton jbtResume = new JButton("Resume");
	private JScrollBar jbtDelay = new JScrollBar();
	
	public BallControl() {
		JPanel panel = new JPanel();
		panel.add(jbtSuspend);
		panel.add(jbtResume);
		
		ball.setBorder(new LineBorder(Color.red));
		jbtDelay.setOrientation(JScrollBar.HORIZONTAL);
		ball.setDelay(jbtDelay.getMaximum());
		setLayout(new BorderLayout());
		add(jbtDelay,BorderLayout.NORTH);
		add(ball,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		jbtSuspend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ball.suspend();
			}
		});
		jbtResume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ball.resume();
			}
		});
		jbtDelay.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				ball.setDelay(jbtDelay.getMaximum()-e.getValue());
			}
		});
	}

}
