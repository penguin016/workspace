import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class computer extends JFrame {
	
	/**
	 * 
	 */
	JButton button1 = new JButton("C");
	JButton button2 = new JButton("del");
	JButton button3 = new JButton("+");
	JButton button4 = new JButton("-");
	JButton button5 = new JButton("*");
	JButton button6 = new JButton("/");
	JButton button7 = new JButton("=");
	JButton button8 = new JButton(".");
	JButton button9 = new JButton("+/-");
	JButton button10 = new JButton("0");
	JButton button11 = new JButton("1");
	JButton button12 = new JButton("2");
	JButton button13 = new JButton("3");
	JButton button14 = new JButton("4");
	JButton button15 = new JButton("5");
	JButton button16 = new JButton("6");
	JButton button17 = new JButton("7");
	JButton button18 = new JButton("8");
	JButton button19 = new JButton("9");
	JTextField textfield = new JTextField("0");
	private static String text;
	private double operator1 = 0;
	private double operator2 = 0;
	private int add_sub_mut_div;
	
	public computer() {
		JPanel p1 = new JPanel(new GridLayout(5,2));
		JPanel p2 = new JPanel(new GridLayout(4,2));
		JPanel p3 = new JPanel(new GridLayout(1,1));
		JPanel p4 = new JPanel(new BorderLayout());
		JPanel p5 = new JPanel(new GridLayout(1,2));
		button1.setForeground(Color.ORANGE);
		button1.setFont(new Font("SansSerif",Font.BOLD,30));
		button2.setForeground(Color.ORANGE);
		button2.setFont(new Font("SansSerif",Font.BOLD,20));
		button3.setForeground(Color.ORANGE);
		button3.setFont(new Font("SansSerif",Font.BOLD,30));
		button4.setForeground(Color.ORANGE);
		button4.setFont(new Font("SansSerif",Font.BOLD,30));
		button5.setForeground(Color.ORANGE);
		button5.setFont(new Font("SansSerif",Font.BOLD,30));
		button6.setForeground(Color.ORANGE);
		button6.setFont(new Font("SansSerif",Font.BOLD,30));
		button7.setForeground(Color.ORANGE);
		button7.setFont(new Font("SansSerif",Font.BOLD,30));
		
		p1.add(button1);
		p1.add(button9);
		p2.add(button2);
		p2.add(button3);
		p1.add(button17);
		p1.add(button18);
		p2.add(button19);
		p2.add(button4);
		p1.add(button14);
		p1.add(button15);
		p2.add(button16);
		p2.add(button5);
		p1.add(button11);
		p1.add(button12);
		p2.add(button13);
		p2.add(button6);
		p1.add(button8);
		p1.add(button10);
		p3.add(button7);
		textfield.setBackground(Color.ORANGE);
		textfield.setFont(new Font("SansSerif",Font.BOLD,30));
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		p4.add(p2,BorderLayout.CENTER);
		p4.add(p3,BorderLayout.SOUTH);
		p5.add(p1);
		p5.add(p4);
		add(p5,BorderLayout.CENTER);
		add(textfield,BorderLayout.NORTH);
		
	}	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public double getOperator1() {
		return operator1;
	}
	public double getOperator2() {
		return operator2;
	}
	public void setOperator1(double operator1) {
		this.operator1 = operator1;
	}
	public void setOperator2(double operator2) {
		this.operator2 = operator2;
	}
	public int getAdd_sub_mut_div() {
		return add_sub_mut_div;
	}
	public void setAdd_sub_mut_div(int add_sub_mut_div) {
		this.add_sub_mut_div = add_sub_mut_div;
	}
}
