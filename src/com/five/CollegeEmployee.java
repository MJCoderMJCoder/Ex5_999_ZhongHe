package com.five;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
	private String ssn;
	private double annualSalary;	//��н
	private String dept;
	
	public void setData() {
		String temp;
		super.setData();	//���ʸ����б����ǵĳ�Ա����
		ssn = JOptionPane.showInputDialog(null, "������Ա������ᱣ�պ�");
		temp = JOptionPane.showInputDialog(null, "������Ա������н");
		annualSalary = Double.parseDouble(temp);
	}
	
	public void display() {
		super.display(); //���ʸ����б����ǵĳ�Ա����
		System.out.println("\tSSN��" + ssn + "\t��н" + annualSalary);
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}

}
