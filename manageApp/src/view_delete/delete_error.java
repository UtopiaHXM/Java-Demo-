package view_delete;

import javax.swing.JOptionPane;

public class delete_error extends JOptionPane{
	
	public delete_error(){
		
		JOptionPane.showMessageDialog(this,"该信息不存在！","删除提示",JOptionPane.INFORMATION_MESSAGE);
		
		validate();
	}
}
