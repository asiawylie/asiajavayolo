package java100;

import java.util.Scanner;

public class dick33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in ); 
		System.out.print("½Ğ¿é¤J¹ï¤èªº¥X¥Í¤ë:"); 
		int month = sc.nextInt(); 
		System.out.print("½Ğ¿é¤J¹ï¤èªº¥X¥Í¤é:"); 
		int day = sc.nextInt(); 
		switch(month) 
		{ 
		case 1: 
		if(day >=1 && day <=20) 
		System.out.print("Å]½~®y"); 
		else if(day>=21 && day<=31) 
		System.out.print("¤ô²~®y");
		break; 
		case 2: 
		if(day >=1 && day <=19) 
		System.out.print("¤ô²~®y");
		else if(day>=20 && day<=29) 
			System.out.print("Âù³½®y"); 
		break; 
		case 3: 
		if(day >=1 && day <=20) 
			System.out.print("Âù³½®y"); 
		else if(day>=21 && day<=31) 
			System.out.print("¨d¦Ï®y"); 
		break; 
		case 4: 
		if(day >=1 && day <=20) 
		System.out.print("¨d¦Ï®y"); 
		else if(day>=21 && day<=30) 
		System.out.print("ª÷¤û®y"); 
		break; 
		case 5: 
		if(day >=1 && day <=21) 
		System.out.print("ª÷¤û®y"); 
		else if(day>=22 && day<=31) 
		System.out.print("Âù¤l®y"); 
		break; 
		case 6: 
		if(day >=1 && day <=21) 
		System.out.print("Âù¤l®y"); 
		else if(day>=22 && day<=30) 
		System.out.print("¥¨ÃÉ®y"); 
		break; 
		case 7: 
		if(day >=1 && day <=23) 
		System.out.print("¥¨ÃÉ®y"); 
		else if(day>=24 && day<=31) 
		System.out.print("·à¤l®y"); 
		break; 
		case 8: 
		if(day >=1 && day <=23) 
		System.out.print("·à¤l®y"); 
		else if(day>=24 && day<=31) 
		System.out.print("³B¤k®y"); 
		break; 
		case 9: 
		if(day >=1 && day <=23) 
		System.out.print("³B¤k®y"); 
		else if(day>=24 && day<=30) 
		System.out.print("¤Ñ¯¯®y"); 
		break; 
		case 10: 
		if(day >=1 && day <=23) 
		System.out.print("¤Ñ¯¯®y"); 
		else if(day>=24 && day<=31) 
		System.out.print("¤ÑÃÈ®y"); 
		break; 
		case 11: 
		if(day >=1 && day <=22) 
		System.out.print("¤ÑÃÈ®y"); 
		else if(day>=23 && day<=30) 
		System.out.print("®g¤â®y"); 
		break; 
		case 12: 
		if(day >=1 && day <=22) 
		System.out.print("®g¤â®y"); 
		else if(day>=23 && day<=31) 
		System.out.print("Å]½~®y"); 
		break; 
		}
		} 
		} 