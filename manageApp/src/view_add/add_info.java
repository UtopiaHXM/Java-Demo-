package view_add;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.PersonDao;

import beans.Person;

public class add_info extends JDialog{
	
	private JButton yesButton,noButton;
	private JTextField show_name,show_Tel,show_Email;
	private static Person person;
	public add_info(String name,JFrame frame,Person person) {
		// TODO Auto-generated constructor stub
		this.person = person;
		final JDialog dialog = new JDialog(frame,name,true);
		Box baseBox,titleBox,infoBox,buttonBox;
		
		//设置标签盒式布局
		titleBox = Box.createHorizontalBox();
		titleBox.add(new JLabel("添加信息：",JLabel.LEFT));
		
		show_name = new JTextField(6);
		show_Tel = new JTextField(11);
		show_Email = new JTextField(20);
		//设置信息盒式布局
		infoBox = Box.createHorizontalBox();
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(new JLabel("姓名："));
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(show_name);
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(new JLabel("电话："));
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(show_Tel);
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(new JLabel("Email："));
		infoBox.add(Box.createHorizontalStrut(8));
		infoBox.add(show_Email);
		infoBox.add(Box.createHorizontalStrut(8));
		
		show_name.setText(person.getName());
		show_Tel.setText(person.getTel());
		show_Email.setText(person.getEmail());
		
		//设置按钮盒式布局
		yesButton = new JButton("Yes");
		noButton = new JButton("No");
		
		buttonBox = Box.createHorizontalBox();
		buttonBox.add(yesButton);
		buttonBox.add(Box.createHorizontalStrut(20));
		buttonBox.add(noButton);

		yesButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				PersonDao.add(add_info.person);
				new add_success();

				show_name.setText(null);
				show_Tel.setText(null);
				show_Email.setText(null);
				
				dialog.setVisible(false);
			}
			
		});
		noButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new add_fail();
				
				show_name.setText(null);
				show_Tel.setText(null);
				show_Email.setText(null);
				
				dialog.setVisible(false);
			}
			
		});		
		
		//设置总盒式布局
		baseBox = Box.createVerticalBox();
		baseBox.add(Box.createVerticalStrut(8));
		baseBox.add(titleBox);
		baseBox.add(Box.createVerticalStrut(8));
		baseBox.add(infoBox);
		baseBox.add(Box.createVerticalStrut(15));
		baseBox.add(buttonBox);
		baseBox.add(Box.createVerticalStrut(8));
		
		dialog.add(baseBox);
		dialog.setBounds(300, 300, 600, 150);
		dialog.setVisible(true);
		validate();		
	}
	
}
