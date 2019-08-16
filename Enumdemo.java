package com.bdqn.shiyonglei;

import java.util.Scanner;

public class Enumdemo {
	public static void Enumdemo(Week week){
		switch (week) {
		case monday:
		case tuesday:
		case thursday:
		case friday:
			System.out.println("好好学习！今天是个好日子");
			break;
		case saturday:
			System.out.println("今天是周天，去看电影");
			break;
		default:
			System.out.println("地球上一个星期就7天");
			break;
		}
	}
	public static void main(String[] args) {
		System.out.println("获取单个枚举类型");
		Enumdemo.Enumdemo(Week.friday);
		Enumdemo.Enumdemo(Week.saturday);
		
		System.out.println("获取多个枚举类型：");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入英文星期：");
		String b=input.next();
		boolean flag=false;
		for(Week a:Week.values()){
			if(b.equals(a.toString())){
				Enumdemo(a);
				flag=true;
			}
		
		}
		if(!flag){
			System.out.println("你输入的英文有误！");
		}
		
	}
}
