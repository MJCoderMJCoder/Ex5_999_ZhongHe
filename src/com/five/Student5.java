package com.five;

import javax.swing.JOptionPane;

public class Student5 extends Person {
	private String id;
	private String major; //רҵ
	private double gpa; //grade point averge
	
	public void setData() {
		String temp;
		super.setData(); //���ʸ����б����ǵĳ�Ա����
		id = JOptionPane.showInputDialog(null, "������ѧ��");
		major = JOptionPane.showInputDialog(null, "������רҵ");
		temp = JOptionPane.showInputDialog(null, "������ѧ��");
		gpa = Double.parseDouble(temp);	//��temp�а��������ֽ���Ϊ��Ӧ��Double���͵�ֵ
	}
	
	public void display() {
		super.display();
		System.out.println("\tרҵ��" + major + "\tѧ�֣�" + gpa);
	}

	public String getMajor() {
		return major;
	}

	public double getGpa() {
		return gpa;
	}
	
}
