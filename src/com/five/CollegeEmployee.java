package com.five;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
	private String ssn;
	private double annualSalary;	//年薪
	private String dept;
	
	public void setData() {
		String temp;
		super.setData();	//访问父类中被覆盖的成员方法
		ssn = JOptionPane.showInputDialog(null, "请输入员工的社会保险号");
		temp = JOptionPane.showInputDialog(null, "请输入员工的年薪");
		annualSalary = Double.parseDouble(temp);
	}
	
	public void display() {
		super.display(); //访问父类中被覆盖的成员方法
		System.out.println("\tSSN：" + ssn + "\t年薪" + annualSalary);
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}

}
