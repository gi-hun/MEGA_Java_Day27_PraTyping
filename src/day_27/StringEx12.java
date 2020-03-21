/*
 * # 타자연습 게임[2단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
 * 예)
 * 문제 : mys*l
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : *sp
 * 입력 : jsp
 * ...
 */

package day_27;

import java.util.Scanner;
import java.util.Random;

public class StringEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};

		int i=0;		//셔플
		while(i<1000)
		{
			int num = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[num];
			words[num] = temp;
			i++;
		}
		
		i = 0;
		while(i<words.length)
		{
			int num = ran.nextInt(words[i].length());
			
			System.out.println("문제:");
			for(int j=0;j<words[i].length();j++)		//단어+* 만들기 위한 과정
			{
				if(j==num)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(words[i].charAt(j));
				}
			}
			System.out.println();
			
			
			System.out.print("정답:");
			String data = sc.next();
			
			if(data.equals(words[i].charAt(num)))
			{
				System.out.println("정답!");
				i++;
			}
			else
			{
				System.out.println("오답");
			}
		}
		
		
	}
}
