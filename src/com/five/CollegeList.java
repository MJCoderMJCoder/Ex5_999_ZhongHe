package com.five;

import javax.swing.JOptionPane;

public class CollegeList {

	public static void main(String[] args) {
		CollegeEmployee[] emp = new CollegeEmployee[10];	//emp������������������
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
		input = JOptionPane.showInputDialog(null, "����C¼��Ա����Ϣ\n����S¼��ѧ����Ϣ\n����Q�˳�");
		input = input.toUpperCase();	//Сдȫ��ת��Ϊ��д
		letter = input.charAt(0);	//��ȡ0����charֵ
		while(letter != 'Q') {
			if(letter == 'C') {
				if(empCount < emp.length) {
					CollegeEmployee c = new CollegeEmployee();
					c.setData();
					emp[empCount] = c;
					++empCount;
					
					//����ƽ����н�������н
					tempAnnualSalary = c.getAnnualSalary();
					sumAnnualSalary = tempAnnualSalary + sumAnnualSalary;
					if(tempAnnualSalary > maxAnnualSalary)
						maxAnnualSalary = tempAnnualSalary;
				} else
					JOptionPane.showConfirmDialog(null, "�Բ���¼��̫��Ա����Ϣ");
			} else if (letter == 'S') {
				if(stuCount < stu.length) {
					Student5 s = new Student5();
					s.setData();
					stu[stuCount] = s;
					++stuCount;
					
					//����ƽ��ѧ�ֺ����ѧ��
					tempGpa = s.getGpa();
					sumGpa += tempGpa;
					if(tempGpa > maxGpa)
						maxGpa = tempGpa;
				}else
					JOptionPane.showConfirmDialog(null, "�Բ���¼��̫��ѧ����Ϣ");
			}
			input = JOptionPane.showInputDialog(null, "����C¼��Ա����Ϣ\n����S¼��ѧ����Ϣ\n����Q�˳�");
			input = input.toUpperCase();	//Сдȫ��ת��Ϊ��д
			letter = input.charAt(0);	//��ȡ0����charֵ
		}
		System.out.println("\nԱ����Ϣ��");
		if (empCount == 0)
			System.out.println("û��¼��Ա����Ϣ");
		else
			for(x = 0; x < empCount; ++x)
				emp[x].display();
		System.out.println("\n����Ա���������н��" + maxAnnualSalary 
				+ "\tƽ����н��" + sumAnnualSalary/empCount);
		
		System.out.println("\nѧ����Ϣ��");
		if (stuCount == 0)
			System.out.println("û��¼��ѧ����Ϣ");
		else
			for(x = 0; x < stuCount; ++x)
				stu[x].display();
		System.out.println("\n����ѧ�������ѧ�֣�" + maxGpa 
				+ "\tƽ��ѧ�֣�" + sumGpa/stuCount);
		
		/*
		 * System��ķ�����public static void exit(int status)
		 * ǿ����ֹ��ǰ�������е�Java�����������������Ϣ���ظ�ϵͳ��
		 * ������Ϊ0����ʾ������ֹ����������Ϊ0�����ʾ�쳣��ֹ��
		 */
		System.exit(0);
	}

}
