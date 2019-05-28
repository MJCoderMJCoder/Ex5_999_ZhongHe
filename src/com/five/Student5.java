package com.five;

import javax.swing.JOptionPane;

public class Student5 extends Person {
	private String id;
	private String major; //专业
	private double gpa; //grade point averge
	
	public void setData() {
		String temp;
		super.setData(); //访问父类中被覆盖的成员方法
		id = JOptionPane.showInputDialog(null, "请输入学号");
		major = JOptionPane.showInputDialog(null, "请输入专业");
		temp = JOptionPane.showInputDialog(null, "请输入学分");
		gpa = Double.parseDouble(temp);	//将temp中包含的数字解析为对应的Double类型的值
	}
	
	public void display() {
		super.display();
		System.out.println("\t专业：" + major + "\t学分：" + gpa);
	}

	public String getMajor() {
		return major;
	}

	public double getGpa() {
		return gpa;
	}
	
}
