package com.five;	
//packageָ��Դ�ļ��е��������ĸ�����İ�

/**
 * JOptionPane(�����������ֱ�׼��ģʽ�Ի���)�Ĳ��ֹ��ܣ�
 * ConfirmDialog��ȷ�϶Ի���
 * InputDialog:�ı�����Ի���
 * MessageDialog����Ϣ��ʾ�Ի���
 * OptionDialog���ۺ�����3�й��ܵĶԻ���
 */
import javax.swing.JOptionPane;

public class Person {
	private String name;
	private String gender;	//�Ա�
	private String address;
	private String phone;
	
	public void setData() {
		name = JOptionPane.showInputDialog(null, "����������");
		address = JOptionPane.showInputDialog(null, "�������ַ");
		gender = JOptionPane.showInputDialog(null, "�������Ա�");
		phone = JOptionPane.showInputDialog(null, "��������ϵ�绰");
	}
	
	public void display() {
		System.out.print("������" + name + "\t�Ա�" + gender + "\t��ַ��" + address + 
				"\t��ϵ�绰��" + phone);
	}

}
