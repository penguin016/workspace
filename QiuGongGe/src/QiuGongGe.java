import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class QiuGongGe extends JFrame {
	private BigLattice[][] qiugongge = new BigLattice[3][3];
	private JPanel center = new JPanel();
	private JPanel east = new JPanel();
	private JPanel panel = new JPanel();
	private JButton button = new JButton("New Game");
	private JButton butResult = new JButton("Result");
	private JTextField time = new JTextField();
	private JLabel label = new JLabel("Time");
	private intAndBoolean[] intboolean = new intAndBoolean[9];
	private int[][] check = new int[9][9];
	private long starttime;
	private long excuttime = 3000;
	public QiuGongGe() {
		starttime = System.currentTimeMillis();
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				center.add(qiugongge[i][j] = new BigLattice());
				for(int m = 0; m < 3; m++){
					for(int n = 0; n < 3; n++)
						if(!(qiugongge[i][j].bigLattice[m][n].jlabel.getText().equals("")))
							check[3*i+m][3*j+n] = Integer.parseInt(qiugongge[i][j].bigLattice[m][n].jlabel.getText());
						else
							check[3*i+m][3*j+n] = 0;
				}
			}
		}
		////////////////////////////
		///////////调整行/////////////
		for(int i = 0; i < 9; i++){
			for(int ii = 0; ii < 9; ii++){
				intboolean[ii] = new intAndBoolean();
				intboolean[ii].ishave = false;
				intboolean[ii].num = ii+1;
			}
			for(int j = 0; j < 9; j++){
				if(check[i][j] != 0){
					int k;
					for(k = 0; k < 9; k++)
						if(check[i][j] == intboolean[k].num)
							break;
					if(intboolean[k].ishave == false)
						intboolean[k].ishave = true;
					else{
						int ran = (int)(Math.random()*9);
						while(qiugongge[i/3][j/3].notappear[ran] == 0)
							ran = (int)(Math.random()*9);
						check[i][j] = qiugongge[i/3][j/3].notappear[ran];
						//
						qiugongge[i/3][j/3].notappear[ran] = 0;
						for(int kk = 0; kk <9; kk++){
							if(qiugongge[i/3][j/3].appear[kk] == 0){
								qiugongge[i/3][j/3].appear[kk] = check[i][j];
								break;
							}
						}
						j--;
					}	
				}
			}
		}	
		//////////////////////////////
		///////////调整列///////////////
		for(int j = 0; j < 9; j++){
			for(int ii = 0; ii < 9; ii++){
				intboolean[ii] = new intAndBoolean();
				intboolean[ii].ishave = false;
				intboolean[ii].num = ii+1;
			}
			for(int i = 0; i < 9; i++){
				if(check[i][j] != 0){
					int k;
					for(k = 0; k < 9; k++)
						if(check[i][j] == intboolean[k].num)
							break;
					if(intboolean[k].ishave == false)
						intboolean[k].ishave = true;
					else{
						for(int m = 0; m < 9; m++){
							int n;
							for(n = 0; n < 9; n ++){
								if(check[n][m] == intboolean[k].num)
									break;
							}
							if(n == 9){
								int temp = check[i][m];
								
								check[i][m] = check[i][j];
								check[i][j] = temp;
								if(m/3 != j/3){
									int kk;
									for(kk = 0; kk < 9; kk++){
										if(check[i][j] != 0)
											if(check[i][j] == qiugongge[i/3][j/3].appear[kk])
												break;
									}		
									if(kk < 9)
										check[i][j] = 0;
									int kkk;
									for(kkk = 0; kkk < 9; kkk++){
										if(check[i][m] != 0)
											if(check[i][m] == qiugongge[i/3][m/3].appear[kkk])
												break;
									}
									if(kkk < 9)
										check[i][m] = 0;
									break;
								}
								else
									break;
							}
						}
						i--;
					}	
				}
			}
		}
		//////////////////////
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int m = 0; m < 3; m++){
					for(int n = 0; n < 3; n++){
						if(check[i*3+m][j*3+n] != 0){
							qiugongge[i][j].bigLattice[m][n].jlabel.setText(Integer.toString(check[i*3+m][j*3+n]));
							qiugongge[i][j].bigLattice[m][n].setBackground(Color.LIGHT_GRAY);
						}
						else{
							qiugongge[i][j].bigLattice[m][n].jlabel.setText("");
							qiugongge[i][j].bigLattice[m][n].setBackground(Color.WHITE);
						}
							
					}
				}
			}
			
		}
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(new LineBorder(Color.GRAY,5));
		butResult.setBackground(Color.LIGHT_GRAY);
		butResult.setBorder(new LineBorder(Color.GRAY,5));
		time.setBackground(Color.LIGHT_GRAY);
		time.setBorder(new TitledBorder(new LineBorder(Color.GRAY,5),"TIME"));
		center.setLayout(new GridLayout(3,3,0,0));
		center.setBorder(new LineBorder(Color.GRAY,20));
		east.setLayout(new GridLayout(5,1,10,20));
		east.add(button);
		east.add(butResult);
		east.add(time);
		east.setBackground(Color.GRAY);
		east.setBorder(new LineBorder(Color.LIGHT_GRAY,10));
		add(center,BorderLayout.CENTER);
		add(east,BorderLayout.EAST);
		
		//监听事件
		butResult.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				result();
			}
		});
		
		
		
	}
	
	protected void result(){
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		boolean isRight = true;
		int i;
		for(i = 0; i < 9; i++){
			for(int ii = 0; ii < 9; ii++){
				intboolean[ii] = new intAndBoolean();
				intboolean[ii].ishave = false;
				intboolean[ii].num = ii+1;
			}
			int j;
			for(j = 0; j < 9; j++){
				if(check[i][j] != 0){
					int k;
					for(k = 0; k < 9; k++)
						if(check[i][j] == intboolean[k].num)
							break;
					if(intboolean[k].ishave == false)
						intboolean[k].ishave = true;
					else{
						isRight = false;
						break;
					}
				}
				else{
					isRight = false;
					break;
				}
			}
			if(j < 9)
				break;
		}
		if(i == 9){
			int iii;
			for(iii = 0; iii < 9; iii++){
				for(int ii = 0; ii < 9; ii++){
					intboolean[ii] = new intAndBoolean();
					intboolean[ii].ishave = false;
					intboolean[ii].num = ii+1;
				}
				int jjj;
				for(jjj = 0; jjj < 9; jjj++){
					if(check[iii][jjj] != 0){
						int k;
						for(k = 0; k < 9; k++)
							if(check[jjj][iii] == intboolean[k].num)
								break;
						if(intboolean[k].ishave == false)
							intboolean[k].ishave = true;
						else{
							isRight = false;
							break;
						}
					}
					else{
						isRight = false;
						break;
					}
				}
				if(jjj < 9)
					break;
			}
			if(iii == 9){
				
				for(int iiii = 0; iiii < 3; iiii++){
					for(int ii = 0; ii < 9; ii++){
						intboolean[ii] = new intAndBoolean();
						intboolean[ii].ishave = false;
						intboolean[ii].num = ii+1;
					}
					int jjjj;
					for(jjjj = 0; jjjj < 3; jjjj++){
						int m;
						for(m = 0; m < 3; m++){
							int n;
							for(n = 0; n < 3; n++){
								if(qiugongge[iiii][jjjj].bigLattice[m][n].jlabel.getText() == ""){
									isRight = false;
									break;
								}
								else{
									int k;
									for(k = 0; k < 9; k++)
										if(Integer.parseInt(qiugongge[iiii][jjjj].bigLattice[m][n].jlabel.getText()) == intboolean[k].num)
											break;
									if(intboolean[k].ishave == false)
										intboolean[k].ishave = true;
									else{
										isRight = false;
										break;
									}
								}
									
							}
							if(n < 3)
								break;
						}
						if(m < 3)
							break;
					}
					if(jjjj < 3)
						break;
				}
			}
		}
			
		if(isRight == false)
			label.setText("结果错误，请重试！");
		else
			label.setText("结果正确！");
		frame.add(label);
		frame.setLocationRelativeTo(null);
		frame.setTitle("结果");
		frame.setVisible(true);
		frame.pack();
		frame.setSize(200, 100);
	}

	public static void main(String[] args) {
		QiuGongGe frame = new QiuGongGe();
		frame.setLocationRelativeTo(null);
		frame.setTitle("九宫格");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
	}
	
	class intAndBoolean {
		int num;
		boolean ishave;
	}
	
}
