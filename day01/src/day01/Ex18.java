package day01;

import java.util.Scanner;

public class Ex18 {


	/*
	 * 18. 사용자로부터 이름과 나이를 입력받아 "안녕하세요, [이름]님. [나이]살이시군요." 형식으로 환영 메시지를 출력하기
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");

		String name = sc.next(); 
		
		System.out.println("나이를 입력하세요: ");
	
		String age = sc.next();

		System.out.println(name + "님 안녕하세요\t" + age + "살 이시군요");
		
		
	}
}
