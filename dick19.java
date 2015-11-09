package java100;
import java.util.Scanner;
public class dick19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char vl=sc.next().charAt(0);
		if (vl>=65 && vl<=90){
			System.out.print((char)(vl+32));
		}else if (vl>=97 && vl<=122){
			System.out.print((char)(vl-32));
		}else{
			System.out.print("此非英文字元");
		}
	}

}
