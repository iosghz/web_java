package day01;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		/*
		 * 17. 두 개의 정수형 변수 num1과 num2를 선언하고, 사용자로부터 입력을 받아 두 수를 더한 결과를 출력하기
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = "";
		String num2 = "";
		
		int result = 0;
		
		System.out.println("정수 1 입력: ");
		num1 = sc.next();
		
		
		System.out.println("정수 2 입력: ");
		num2 = sc.next();
		
		result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.printf("두 정수의 합은: %d입니다." , result);
		
		
	}
	

}
