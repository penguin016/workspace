import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class DaQiQiui extends JFrame {
	private JButton button1;
	private JButton button2;
	private JTextField text1;
	private JTextField text2;
	private JTextField textfield;
	private JPanel panel;
	private JPanel panel2;
	private JPanel panel3;
	private int miss = 0;
	private int hit = 0;
	private int time = 60;
	private QiQiu qiqiu;
	public DaQiQiui() {
		
		button1 = new JButton("开始");
		button2 = new JButton("暂停");
		text1 = new JTextField();
		text2 = new JTextField();
		text1.setBorder(new TitledBorder("丢失"));
		text2.setBorder(new TitledBorder("击中"));
		text1.setText(Integer.toString(miss));
		text2.setText(Integer.toString(hit));
		textfield = new JTextField();
		textfield.setBorder(new TitledBorder("时间"));
		textfield.setText(Integer.toString(time));
		panel = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel.setLayout(new GridLayout(5,1,20,20));
		panel.add(button1);
		panel.add(button2);
        panel.add(text1);
        panel.add(text2);
		panel.add(textfield);
		panel2.add(panel,BorderLayout.CENTER);
		panel2.setBackground(Color.WHITE);
		panel2.setBorder(new TitledBorder(""));
		add(panel2,BorderLayout.EAST);
		//panel3.setSize(400, 500);
		//panel3.add(new QiQiu());
		//panel3.setBorder(new LineBorder(Color.BLACK,1));
		//add(panel3,BorderLayout.CENTER);
		
		qiqiu = new QiQiu();
		add(qiqiu,BorderLayout.CENTER);
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				qiqiu.timer.start();
				qiqiu.timetime.start();
			}
		});

		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(button2.getText().equals("暂停")){
					//qiqiu.timer.stop();
					
					button2.setText("继续");
				}
				else if(button2.getText().equals("继续")){
					//qiqiu.timer.restart();
					button2.setText("暂停");
				}
				
			}
		});
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaQiQiui frame = new DaQiQiui();
		frame.setTitle("打气球");
		frame.setLocation(800,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(470,490);
		frame.setVisible(true);

	}
    class QiQiu extends JPanel {
		private int x;
		private int y;
		private point inition = new point();
		private point destination = new point();
		private double zidanX = 0; 
		private double zidanY = 0;
        private point[] qiqiu = new point[100];
        private int degree = 90;
        private Timer timer0 = new Timer(50,new TimerListener0()),
                timer = new Timer(2000,new TimerListener()),
        		timetime= new Timer(1000,new TimerListenertime());
        private Boolean orZidan = false;
        int num = 0;
        private int whichPart;
		public QiQiu() {
			for(int i = 0;i<100;i++)
				qiqiu[i] = new point();
			inition.x = 200;
			inition.y = 500;
			this.setFocusable(true);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT: 
						if(degree<150)
						degree = degree+5;
						whichPart = 0;
						repaint(0,400,400,100);
						break;
					case KeyEvent.VK_RIGHT: 
						if(degree>30)
						degree = degree-5;
						whichPart = 0;
						repaint(0,400,400,100);
						break;
					case KeyEvent.VK_UP:
						if(orZidan == false){
							zidanX = 200+100*Math.cos(Math.toRadians(degree));
						    zidanY = 500-100*Math.sin(Math.toRadians(degree));
						    //timer0 = new Timer(50,new TimerListener0());
			                timer0.start();
			                orZidan = true;
						}
						break;
					}
				}
			});
		
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			switch(whichPart){
			case 0:
				destination.x = (int) (200+100*Math.cos(Math.toRadians(degree)));
				destination.y = (int) (500-100*Math.sin(Math.toRadians(degree)));
				g.drawLine(inition.x, inition.y, destination.x, destination.y);
				break;
			case 1:
				x = ((int)(Math.random()*380))/20;
				y = 14;
				int squ = 0;
				while(qiqiu[squ].yes == true){
					squ++;
				}
				qiqiu[squ].x = x;
				qiqiu[squ].y = y;
				qiqiu[squ].yes = true;
				num++;
				int count = 0;
			    for(int i = 0;count<num;i++){
			    	if(qiqiu[i].yes == true){
			    		g.drawOval(qiqiu[i].x*20, qiqiu[i].y*20, 20, 20); 
			    		count++;
			    	}	
			    }
			    for(int i = 0;qiqiu[i].yes == true;i++){
			    		qiqiu[i].y--;
			    		if(qiqiu[i].y<0){
			    		qiqiu[i].x = 0;
		    			qiqiu[i].y = 0;
		    			qiqiu[i].yes = false;
		    			num--;
		    			miss++;
		    			text1.setText(Integer.toString(miss));
			    		}
			    }
			    break;
			case 2:
				g.fillOval((int)zidanX, (int)zidanY, 7, 7);
				zidanX = zidanX - 10*Math.sin(Math.atan((200-zidanX)/(500-zidanY)));
				zidanY = zidanY - 10*Math.cos(Math.atan((200-zidanX)/(500-zidanY)));
				if(zidanX<-10 || zidanX>380 ||zidanY<-10){
					orZidan = false;
					timer0.stop();
				}			
				int countc =0;
			    for(int i = 0;countc<num;i++){
			    	if(qiqiu[i].yes == true){
			    		if(Math.sqrt((qiqiu[i].x*20-zidanX)*(qiqiu[i].x*20-zidanX)+(qiqiu[i].y*20-zidanY)*(qiqiu[i].y*20-zidanY))<20) {
			    			qiqiu[i].yes = false;
			    			num--;
			    			hit++;
			    			text2.setText(Integer.toString(hit));
			    			timer0.stop();
							orZidan = false;
							whichPart = 3;
							repaint(0,0,400,400);
			    		}
			    		countc++;
			    	}	
			    }
				break;
			case 3:
				int count1 = 0;
			    for(int i = 0;count1<num;i++){
			    	if(qiqiu[i].yes == true){
			    		g.drawOval(qiqiu[i].x*20, qiqiu[i].y*20, 20, 20); 
			    		count1++;
			    	}	
			    }
			}
		}
		class TimerListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				whichPart = 1;
				repaint(0,0,(int)zidanX,400);
				repaint((int)zidanX,0,20,(int)zidanY);
				repaint((int)zidanX,(int)zidanY+20,20,400-(int)zidanY-20);
				repaint((int)zidanX+20,0,400-(int)zidanX-20,400);
			}
		}
		class TimerListener0 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				whichPart = 2;
				repaint((int)zidanX-10,(int)zidanY,30,20);
			}
		}
		class TimerListenertime implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				time--;
                textfield.setText(Integer.toString(time));
                if(time == 0){
                	timer.stop();
                	timetime.stop();
                	timer0.stop();
                } 	
			}
		}
		class point {
			private int x;
			private int y;
			private Boolean yes;
			point() {
				this.x = 0;
				this.y = 0;
				this.yes = false;
			}
		}
	}
}


