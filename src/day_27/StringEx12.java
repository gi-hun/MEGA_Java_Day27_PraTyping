/*
 * # Ÿ�ڿ��� ����[2�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
 * ��)
 * ���� : mys*l
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : *sp
 * �Է� : jsp
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

		int i=0;		//����
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
			
			System.out.println("����:");
			for(int j=0;j<words[i].length();j++)		//�ܾ�+* ����� ���� ����
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
			
			
			System.out.print("����:");
			String data = sc.next();
			
			if(data.equals(words[i].charAt(num)))
			{
				System.out.println("����!");
				i++;
			}
			else
			{
				System.out.println("����");
			}
		}
		
		
	}
}
