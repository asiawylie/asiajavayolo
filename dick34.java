package java100;
import java.util.*;
public class dick34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J���ϥΤ��ɶ�(����)�G");
		int n=sc.nextInt();
		if(n<600){
			System.out.print("$="+(n*0.5)+"��");
			
		}else if (n>=600 && n<=1200){
			System.out.print("$="+(n*0.5*0.9)+"��");
			
		}else{
			System.out.print("$="+(n*0.5*0.79)+"��");
		}
	}

}
