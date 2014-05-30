import javax.swing.JFrame;


public class mmain extends JFrame{

	public mmain(){
		//add(new x2());
		add(new sin());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mmain frame = new mmain();
		frame.setTitle("¶þ´ÎÇúÏß");
		frame.setSize(500,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
