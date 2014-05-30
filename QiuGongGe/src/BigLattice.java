import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class BigLattice extends JPanel {
	SmallLattice[][] bigLattice = new SmallLattice[3][3];
	int appear[] = {0,0,0,0,0,0,0,0,0};
	int notappear[] = {1,2,3,4,5,6,7,8,9};
	public BigLattice() {
		setLayout(new GridLayout(3,3,0,0));
		int count = 0;
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				while(true){
					SmallLattice temp = new SmallLattice();
					if(temp.isNum == false){
						add(bigLattice[i][j] = temp);
						break;
					}
					else{
						int ii,jj = 0;
						for(ii=0;ii<i;ii++){
							for(jj=0;jj<3;jj++){
								if(bigLattice[ii][jj].isNum == true)
									if(bigLattice[ii][jj].jlabel.getText().equals(temp.jlabel.getText()))
										break;
							}
							if(jj<3)break;
						}
						int jjj;
						for(jjj = 0;jjj<j;jjj++){
							if(bigLattice[ii][jjj].isNum == true)
								if(bigLattice[ii][jjj].jlabel.getText().equals(temp.jlabel.getText()))
									break;
						}
						if(ii == i && jjj == j){
							add(bigLattice[i][j] = temp);
							appear[count] = Integer.parseInt(temp.jlabel.getText());
							count++;
							for(int kk = 0; kk < 9; kk++)
								if(notappear[kk] == Integer.parseInt(temp.jlabel.getText()))
									notappear[kk] = 0;
							break;
						}	
					}
				}
			}
		}
		setBorder(new LineBorder(Color.BLACK));
	}
}
