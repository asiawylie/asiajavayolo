package java100;

import java.util.Scanner;

public class dick33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in ); 
		System.out.print("�п�J��誺�X�ͤ�:"); 
		int month = sc.nextInt(); 
		System.out.print("�п�J��誺�X�ͤ�:"); 
		int day = sc.nextInt(); 
		switch(month) 
		{ 
		case 1: 
		if(day >=1 && day <=20) 
		System.out.print("�]�~�y"); 
		else if(day>=21 && day<=31) 
		System.out.print("���~�y");
		break; 
		case 2: 
		if(day >=1 && day <=19) 
		System.out.print("���~�y");
		else if(day>=20 && day<=29) 
			System.out.print("�����y"); 
		break; 
		case 3: 
		if(day >=1 && day <=20) 
			System.out.print("�����y"); 
		else if(day>=21 && day<=31) 
			System.out.print("�d�Ϯy"); 
		break; 
		case 4: 
		if(day >=1 && day <=20) 
		System.out.print("�d�Ϯy"); 
		else if(day>=21 && day<=30) 
		System.out.print("�����y"); 
		break; 
		case 5: 
		if(day >=1 && day <=21) 
		System.out.print("�����y"); 
		else if(day>=22 && day<=31) 
		System.out.print("���l�y"); 
		break; 
		case 6: 
		if(day >=1 && day <=21) 
		System.out.print("���l�y"); 
		else if(day>=22 && day<=30) 
		System.out.print("���ɮy"); 
		break; 
		case 7: 
		if(day >=1 && day <=23) 
		System.out.print("���ɮy"); 
		else if(day>=24 && day<=31) 
		System.out.print("��l�y"); 
		break; 
		case 8: 
		if(day >=1 && day <=23) 
		System.out.print("��l�y"); 
		else if(day>=24 && day<=31) 
		System.out.print("�B�k�y"); 
		break; 
		case 9: 
		if(day >=1 && day <=23) 
		System.out.print("�B�k�y"); 
		else if(day>=24 && day<=30) 
		System.out.print("�ѯ��y"); 
		break; 
		case 10: 
		if(day >=1 && day <=23) 
		System.out.print("�ѯ��y"); 
		else if(day>=24 && day<=31) 
		System.out.print("���Ȯy"); 
		break; 
		case 11: 
		if(day >=1 && day <=22) 
		System.out.print("���Ȯy"); 
		else if(day>=23 && day<=30) 
		System.out.print("�g��y"); 
		break; 
		case 12: 
		if(day >=1 && day <=22) 
		System.out.print("�g��y"); 
		else if(day>=23 && day<=31) 
		System.out.print("�]�~�y"); 
		break; 
		}
		} 
		} 