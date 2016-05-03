package view_add;

import javax.swing.JOptionPane;

public class add_fail extends JOptionPane{
	
	public add_fail(){
		
		JOptionPane.showMessageDialog(this,"添加失败！","添加信息提示",JOptionPane.INFORMATION_MESSAGE);
		
		validate();
	}
}
