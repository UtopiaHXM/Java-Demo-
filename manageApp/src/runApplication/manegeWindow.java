package runApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import view_add.add_error;
import view_add.add_info;
import view_add.add_notfound;
import view_delete.delete_error;
import view_delete.delete_info;
import view_delete.delete_notfound;
import view_find.find_condition;
import view_find.find_error;
import view_find.find_info;
import view_find.find_notfound;

import control.PersonDao;

import beans.Person;

public class manegeWindow extends JFrame implements ActionListener{
	
	private JButton JButton1,JButton2,JButton3;
	private JTextField name_JTextField,tel_JTextField,email_JTextField;
	private JCheckBox byname,byTel,byEmail;
	private boolean choose = true;
	public manegeWindow(String name) {
		// TODO Auto-generated constructor stub

		JButton1 = new JButton("�����û�");
		JButton2 = new JButton("ע�����û�");
		JButton3 = new JButton("ɾ���û�");
		name_JTextField = new JTextField(6);
		tel_JTextField = new JTextField(11);
		email_JTextField = new JTextField(16);
		
		setTitle(name);
		setLocation(120,120);
		Box basebox,title_box,info_box,find_box,button_box;
		//�����ܱ�ǩ
		title_box = Box.createVerticalBox();
		title_box.add(new JLabel("�û���Ϣ����"));
		title_box.add(Box.createVerticalStrut(8));

		//������Ϣ��ʽ����
		info_box = Box.createHorizontalBox();
		info_box.add(Box.createHorizontalStrut(8));
		info_box.add(new JLabel("������"));
		info_box.add(Box.createHorizontalStrut(8));
		info_box.add(name_JTextField);
		info_box.add(Box.createHorizontalStrut(8));
		info_box.add(new JLabel("�绰��"));
		info_box.add(Box.createHorizontalStrut(8));
		info_box.add(tel_JTextField);
		info_box.add(Box.createHorizontalStrut(8));
		info_box.add(new JLabel("Email:"));
		info_box.add(Box.createHorizontalStrut(8));
		info_box.add(email_JTextField);
		
		
		//���ò��Һ�ʽ����
		byname = new JCheckBox("���������ң�");
		byTel = new JCheckBox("���绰���ң�");
		byEmail = new JCheckBox("��Email���ң�");
		find_box = Box.createHorizontalBox();
		find_box.add(new JLabel("���ң�"));
	    find_box.add(Box.createHorizontalStrut(8));
		find_box.add(byname);
		find_box.add(Box.createHorizontalStrut(20));
		find_box.add(byTel);
		find_box.add(Box.createHorizontalStrut(20));
		find_box.add(byEmail);
		
		//���ð�ť��ʽ����
		JButton1.addActionListener(this);
		JButton2.addActionListener(this);
		JButton3.addActionListener(this);
		button_box = Box.createHorizontalBox();
		button_box.add(JButton1);
		button_box.add(Box.createHorizontalStrut(15));
		button_box.add(JButton2);
		button_box.add(Box.createHorizontalStrut(15));
		button_box.add(JButton3);
		button_box.add(Box.createHorizontalStrut(15));
		
		//�����ܺ�ʽ����
		basebox = Box.createVerticalBox();
		basebox.add(Box.createVerticalStrut(10));
		basebox.add(title_box);
		basebox.add(Box.createVerticalStrut(10));
		basebox.add(info_box);
		basebox.add(Box.createVerticalStrut(10));
		basebox.add(find_box);
		basebox.add(Box.createVerticalStrut(10));
		basebox.add(button_box);
		basebox.add(Box.createVerticalStrut(10));
		
		//����ܺ�ʽ����
		add(basebox);
		validate();
		setVisible(true);
		setBounds(120, 125, 800, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		//�����ѯ��¼ʱ
		if(e.getSource().equals(JButton1)){

			if(name_JTextField.getText().equals("")&&tel_JTextField.getText().equals("")&&email_JTextField.getText().equals("")){
                
				new find_error();

System.out.println("�������ѯ��Ϣ��");

			}
			else {
				if(!byname.isSelected()&&!byTel.isSelected()&&!byEmail.isSelected()){
System.out.println("��ѡ�����������");
                    choose = false;
					new find_condition();

				}
				
				if(byname.isSelected()&&byTel.isSelected()&&byEmail.isSelected()){
					choose = true;
System.out.println("ȫ������ѯ");

					Person person = new Person(null,null,null);

					person.setName(name_JTextField.getText());
					person.setTel(tel_JTextField.getText());
					person.setEmail(email_JTextField.getText());

					Person temp = null;
					temp = PersonDao.find(person);
					if(temp==null){
						new find_notfound();
					}
					if(temp!=null){
						new find_info("��ѯ��¼", this,temp);
					}
				
				}
				else {
					
					choose = false;
					Person person = new Person(null,null,null);
					
					person.setName(name_JTextField.getText());
					person.setTel(tel_JTextField.getText());
					person.setEmail(email_JTextField.getText());
					
					Person temp = null;
					
					//����������
					
					if(byname.isSelected()){

						choose = true;
						temp = PersonDao.findByname(person);
System.out.println("��������  "+temp);
						if(temp==null){
							new find_notfound();
						}
						if(temp!=null){
							new find_info("��ѯ��¼", this,temp);
						}
			            
					}
					
					//���绰����
					if(byTel.isSelected()){
						
						choose = true;
						temp = PersonDao.findByTel(person);
System.out.println("�绰����  "+temp);
						if(temp==null){
							new find_notfound();
						}
						if(temp!=null){
							new find_info("��ѯ��¼", this,temp);
						}

					}
					
					//���������
					if(byEmail.isSelected()){
						
						choose = true;
System.out.println("�������  "+temp);
						if(temp==null){
							new find_notfound();
						}
						if(temp!=null){
							new find_info("��ѯ��¼", this,temp);
						}
					}
					
		           /* name_JTextField.setText(null);
					tel_JTextField.setText(null);
					email_JTextField.setText(null);
					
					byname.setSelected(false);
					byTel.setSelected(false);
					byEmail.setSelected(false);
					*/
				}

			}
			
			byname.setSelected(false);
			byTel.setSelected(false);
			byEmail.setSelected(false);	
		
			if (choose) {
				name_JTextField.setText(null);
				tel_JTextField.setText(null);
				email_JTextField.setText(null);
			}
					
		}
		
		//׷���¼�¼
		if(e.getSource().equals(JButton2)){
			
			Person person = new Person(name_JTextField.getText(),tel_JTextField.getText(),email_JTextField.getText());
			Person temp = PersonDao.find(person);
			if(name_JTextField.getText().equals("")&&tel_JTextField.getText().equals("")&&email_JTextField.getText().equals("")){
                
				new add_notfound();
				
System.out.println("������������Ϣ��");

			}else{
				if(temp==null){
					new add_info("׷���¼�¼", this,person);
					
					name_JTextField.setText(null);
					tel_JTextField.setText(null);
					email_JTextField.setText(null);
				}
				if(temp!=null){
			System.out.println("����Ϣ�Ѵ��ڣ�");
					new add_error();
					
					name_JTextField.setText(null);
					tel_JTextField.setText(null);
					email_JTextField.setText(null);
				}
			}
			
			
		}
		
		//ɾ����Ϣ
		if(e.getSource().equals(JButton3)){
			Person person = new Person(name_JTextField.getText(),tel_JTextField.getText(),email_JTextField.getText());
			Person temp = PersonDao.find(person);
			if(name_JTextField.getText().equals("")&&tel_JTextField.getText().equals("")&&email_JTextField.getText().equals("")){
                
				new delete_notfound();
				
System.out.println("������ɾ����Ϣ��");

			}
			else{
				if(temp!=null){

					new delete_info("ɾ����¼", this,temp);
					
					name_JTextField.setText(null);
					tel_JTextField.setText(null);
					email_JTextField.setText(null);
					
					
				}
				if(temp==null){
	System.out.println("����Ϣ�����ڣ�");
					new delete_error();
				
				name_JTextField.setText(null);
				tel_JTextField.setText(null);
				email_JTextField.setText(null);
			   }
			}
			
	   }
	}
}
