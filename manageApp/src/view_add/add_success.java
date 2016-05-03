package view_add;

import javax.swing.JOptionPane;

public class add_success extends JOptionPane{
	
	public add_success(){
		
		JOptionPane.showMessageDialog(this,"添加成功！","提示",JOptionPane.INFORMATION_MESSAGE);
		
		validate();
	}
}
