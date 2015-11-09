package java100;
import java.util.*;
public class dick06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char v1= sc.next().charAt(0);
		if (v1>=65 && v1<=90){
			System.out.print("大寫");
		}else if (v1>=97 && v1<=122){
			System.out.print("小寫");
		}else{
			System.out.print("為其他字元");
		}
	}

}
