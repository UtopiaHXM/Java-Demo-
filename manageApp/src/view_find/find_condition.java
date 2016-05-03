package view_find;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class find_condition extends JDialog{

	public find_condition(){
		
		JOptionPane.showMessageDialog(this,"请输入查询条件！","查询提示",JOptionPane.INFORMATION_MESSAGE);
		
		validate();
	}

}
