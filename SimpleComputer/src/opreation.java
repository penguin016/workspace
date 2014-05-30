import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.text.BadLocationException;


public class opreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final computer frame = new computer();
		frame.setTitle("MyComputer");
		frame.setSize(320,340);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					if(frame.getText().matches("0")){
						frame.setText(null);
						frame.textfield.setText("0");
					}	
					else{
						frame.setText(frame.getText()+"0");
						frame.textfield.setText(frame.getText());
					}		
				else{
					frame.setText(null);
					frame.textfield.setText("0");
				}
			}
		});
		frame.button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"1");
				else
					frame.setText("1");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"2");
				else
					frame.setText("2");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"3");
				else
					frame.setText("3");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"4");
				else
					frame.setText("4");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"5");
				else
					frame.setText("5");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"6");
				else
					frame.setText("6");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"7");
				else
					frame.setText("7");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"8");
				else
					frame.setText("8");
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					frame.setText(frame.getText()+"9");
				else
					frame.setText("9");
				frame.textfield.setText(frame.getText());
			}
		});
		
		frame.button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setText(null);
				frame.textfield.setText("0");
			}
		});
		frame.button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp =null;
				try {
					temp = frame.textfield.getText(0, frame.textfield.getText().length()-1);
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setText(temp);
				frame.textfield.setText(frame.getText());
			}
		});
		frame.button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setOperator1(Double.parseDouble(frame.textfield.getText()));
				frame.setAdd_sub_mut_div(1);
				frame.setText(null);
				frame.textfield.setText(null);
			}
		});	
		frame.button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setOperator1(Double.parseDouble(frame.textfield.getText()));
				frame.setAdd_sub_mut_div(2);
				frame.setText(null);
				frame.textfield.setText(null);
			}
		});
		frame.button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setOperator1(Double.parseDouble(frame.textfield.getText()));
				frame.setAdd_sub_mut_div(3);
				frame.setText(null);
				frame.textfield.setText(null);
			}
		});
		frame.button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setOperator1(Double.parseDouble(frame.textfield.getText()));
				frame.setAdd_sub_mut_div(4);
				frame.setText(null);
				frame.textfield.setText(null);
			}
		});
		frame.button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setOperator2(Double.parseDouble(frame.textfield.getText()));
				frame.setText(null);
				double temp;
				switch(frame.getAdd_sub_mut_div()){
				case 1:
					temp = frame.getOperator1()+frame.getOperator2();
					if(temp == (int)temp)
						frame.textfield.setText(String.valueOf((int)temp));
					else
						frame.textfield.setText(String.valueOf(temp));
				break;
				case 2:
					temp = frame.getOperator1()-frame.getOperator2();
					if(temp == (int)temp)
						frame.textfield.setText(String.valueOf((int)temp));
					else
						frame.textfield.setText(String.valueOf(temp));
				break;
				case 3:
					temp = frame.getOperator1()*frame.getOperator2();
					if(temp == (int)temp)
						frame.textfield.setText(String.valueOf((int)temp));
					else
						frame.textfield.setText(String.valueOf(temp));
				break;
				case 4:
					temp = frame.getOperator1()/frame.getOperator2();
					if(temp == (int)temp)
						frame.textfield.setText(String.valueOf((int)temp));
					else
						frame.textfield.setText(String.valueOf(temp));
				break;
				}
				frame.setOperator1(0);
				frame.setOperator2(0);
			}
		});
		frame.button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean temp = true;
				if(frame.getText()!=null){
					for(int i=0;i<frame.getText().length();i++){
						if(frame.getText().charAt(i) - '.' == 0)
						temp = false;
					}
					if(temp)
						frame.setText(frame.getText()+".");
					}	
			    else
					frame.setText("0.");
					frame.textfield.setText(frame.getText());
			}
		});
		frame.button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getText()!=null)
					if(frame.getText().charAt(0)-'-' != 0)
						frame.setText("-"+frame.getText());
					else{
						try {
							frame.setText(frame.textfield.getText(1,frame.textfield.getText().length()-1));
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				else
					frame.setText("-0");
				frame.textfield.setText(frame.getText());
			}
		});
		
		
	}
}
