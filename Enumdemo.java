package com.bdqn.shiyonglei;

import java.util.Scanner;

public class Enumdemo {
	public static void Enumdemo(Week week){
		switch (week) {
		case monday:
		case tuesday:
		case thursday:
		case friday:
			System.out.println("�ú�ѧϰ�������Ǹ�������");
			break;
		case saturday:
			System.out.println("���������죬ȥ����Ӱ");
			break;
		default:
			System.out.println("������һ�����ھ�7��");
			break;
		}
	}
	public static void main(String[] args) {
		System.out.println("��ȡ����ö������");
		Enumdemo.Enumdemo(Week.friday);
		Enumdemo.Enumdemo(Week.saturday);
		
		System.out.println("��ȡ���ö�����ͣ�");
		Scanner input = new Scanner(System.in);
		System.out.println("������Ӣ�����ڣ�");
		String b=input.next();
		boolean flag=false;
		for(Week a:Week.values()){
			if(b.equals(a.toString())){
				Enumdemo(a);
				flag=true;
			}
		
		}
		if(!flag){
			System.out.println("�������Ӣ������");
		}
		
	}
}
