/*
 * # Ÿ�ڿ��� ����[1�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * ��)
 * ���� : mysql
 * �Է� : mydb
 * ���� : mysql
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : jsp
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
			System.out.println("����" + "[" + (j+1) + "]: " + words[j]);
			
			System.out.println("�Է�");
			String word = sc.next();
			
			if(words[j].equals(word))
			{
				j++;
			}
		}
		System.out.println("��� ������ ������ϴ�.");
	}
}
