package view_find;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class find_notfound extends JDialog{

	public find_notfound(){
		
		JOptionPane.showMessageDialog(this,"所要查询的信息不存在！","查询提示",JOptionPane.INFORMATION_MESSAGE);
		
		validate();
	}

}