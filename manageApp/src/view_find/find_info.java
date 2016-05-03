package view_find;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import beans.Person;

public class find_info extends JDialog{

	public find_info(String name,JFrame frame,Person person) {
		// TODO Auto-generated constructor stub
		JDialog dialog = new JDialog(frame,name,true);
		Box baseBox,titleBox,infoBox/*,buttonBox*/;
		
		//���ñ�ǩ��ʽ����
		titleBox = Box.createHorizontalBox();
		titleBox.add(new JLabel("���Ҽ�¼��",JLabel.LEFT));
		
		JTextField show_name,show_Tel,show_Email;
		show_name = new JTextField(6);
		show_Tel = new JTextField(11);
		show_Email = new JTextField(20);
		//������Ϣ��ʽ����
		infoBox = Box.createHorizontalBox();
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(new JLabel("������"));
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(show_name);
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(new JLabel("�绰��"));
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(show_Tel);
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(new JLabel("Email��"));
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(show_Email);
		infoBox.add(Box.createHorizontalStrut(8));
		
		show_name.setText(person.getName());
		show_Tel.setText(person.getTel());
		show_Email.setText(person.getEmail());
		
		//�����ܺ�ʽ����
		baseBox = Box.createVerticalBox();
		baseBox.add(Box.createVerticalStrut(8));
		baseBox.add(titleBox);
		baseBox.add(Box.createVerticalStrut(8));
		baseBox.add(infoBox);
		baseBox.add(Box.createVerticalStrut(10));
		
		dialog.add(baseBox);
		dialog.setBounds(300, 300, 600, 100);
		dialog.setVisible(true);
		validate();		
	}
	
}
