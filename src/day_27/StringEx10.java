/*
 * # 타자연습 게임[1단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */
package day_27;

import java.util.Scanner;	
import java.util.Random;

public class StringEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"java", "mysql", "jsp", "spring"};

		int i = 0;
		while(i<1000)
		{
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
			i++;
		}
		
		int j = 0;
		while(j<words.length)
		{
			System.out.println("문제" + "[" + (j+1) + "]: " + words[j]);
			
			System.out.println("입력");
			String word = sc.next();
			
			if(words[j].equals(word))
			{
				j++;
			}
		}
		System.out.println("모든 문제를 맞췄습니다.");
	}
}
