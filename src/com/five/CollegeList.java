package com.five;

import javax.swing.JOptionPane;

public class CollegeList {

	public static void main(String[] args) {
		CollegeEmployee[] emp = new CollegeEmployee[10];	//emp对象数组声明并创建
		Student5[] stu = new Student5[20];
		int empCount = 0;
		int facCount = 0;
		int stuCount = 0;
		char letter;
		String input;
		int x;
		double maxAnnualSalary = 0;
		double avgAnnualSalary = 0;
		double tempAnnualSalary = 0;
		double sumAnnualSalary = 0;
		double maxGpa = 0, avgGpa = 0, tempGpa = 0 , sumGpa = 0;
		input = JOptionPane.showInputDialog(null, "输入C录入员工信息\n输入S录入学生信息\n输入Q退出");
		input = input.toUpperCase();	//小写全部转换为大写
		letter = input.charAt(0);	//获取0处的char值
		while(letter != 'Q') {
			if(letter == 'C') {
				if(empCount < emp.length) {
					CollegeEmployee c = new CollegeEmployee();
					c.setData();
					emp[empCount] = c;
					++empCount;
					
					//计算平均年薪和最高年薪
					tempAnnualSalary = c.getAnnualSalary();
					sumAnnualSalary = tempAnnualSalary + sumAnnualSalary;
					if(tempAnnualSalary > maxAnnualSalary)
						maxAnnualSalary = tempAnnualSalary;
				} else
					JOptionPane.showConfirmDialog(null, "对不起，录入太多员工信息");
			} else if (letter == 'S') {
				if(stuCount < stu.length) {
					Student5 s = new Student5();
					s.setData();
					stu[stuCount] = s;
					++stuCount;
					
					//计算平均学分和最高学分
					tempGpa = s.getGpa();
					sumGpa += tempGpa;
					if(tempGpa > maxGpa)
						maxGpa = tempGpa;
				}else
					JOptionPane.showConfirmDialog(null, "对不起，录入太多学生信息");
			}
			input = JOptionPane.showInputDialog(null, "输入C录入员工信息\n输入S录入学生信息\n输入Q退出");
			input = input.toUpperCase();	//小写全部转换为大写
			letter = input.charAt(0);	//获取0处的char值
		}
		System.out.println("\n员工信息：");
		if (empCount == 0)
			System.out.println("没有录入员工信息");
		else
			for(x = 0; x < empCount; ++x)
				emp[x].display();
		System.out.println("\n以上员工的最高年薪：" + maxAnnualSalary 
				+ "\t平均年薪：" + sumAnnualSalary/empCount);
		
		System.out.println("\n学生信息：");
		if (stuCount == 0)
			System.out.println("没有录入学生信息");
		else
			for(x = 0; x < stuCount; ++x)
				stu[x].display();
		System.out.println("\n以上学生的最高学分：" + maxGpa 
				+ "\t平均学分：" + sumGpa/stuCount);
		
		/*
		 * System类的方法：public static void exit(int status)
		 * 强制终止当前正在运行的Java虚拟机，并将参数信息返回给系统。
		 * 若参数为0，表示正常终止；若参数不为0，则表示异常终止。
		 */
		System.exit(0);
	}

}
