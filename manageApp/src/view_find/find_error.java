package view_find;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class find_error extends JDialog{

	public find_error(){
		
		JOptionPane.showMessageDialog(this,"请输入要查询的信息！","查询提示",JOptionPane.INFORMATION_MESSAGE);
		
		validate();
	}

}
