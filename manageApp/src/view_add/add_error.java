package view_add;

import javax.swing.JOptionPane;

public class add_error extends JOptionPane{
	
	public add_error(){
		
		JOptionPane.showMessageDialog(this,"该信息已存在！","添加信息提示",JOptionPane.INFORMATION_MESSAGE);
		
		validate();
	}
}
