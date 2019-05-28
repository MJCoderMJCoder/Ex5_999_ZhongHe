package com.five;	
//package指明源文件中的类属于哪个具体的包

/**
 * JOptionPane(用来弹出各种标准的模式对话框)的部分功能：
 * ConfirmDialog：确认对话框
 * InputDialog:文本输入对话框
 * MessageDialog：信息显示对话框
 * OptionDialog：综合上述3中功能的对话框
 */
import javax.swing.JOptionPane;

public class Person {
	private String name;
	private String gender;	//性别
	private String address;
	private String phone;
	
	public void setData() {
		name = JOptionPane.showInputDialog(null, "请输入姓名");
		address = JOptionPane.showInputDialog(null, "请输入地址");
		gender = JOptionPane.showInputDialog(null, "请输入性别");
		phone = JOptionPane.showInputDialog(null, "请输入联系电话");
	}
	
	public void display() {
		System.out.print("姓名：" + name + "\t性别：" + gender + "\t地址：" + address + 
				"\t联系电话：" + phone);
	}

}
