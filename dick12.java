package java100;
import java.util.*;
public class dick12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入國文、英文和數學成績：");
		int C=sc.nextInt();
		int E=sc.nextInt();
		int M=sc.nextInt();
		System.out.println("每科平均成績："+(C+E+M));		
		System.out.print("總分數："+((C+E+M)/3));
	}

}
