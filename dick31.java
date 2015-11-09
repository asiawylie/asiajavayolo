package java100;
import java.util.*;
public class dick31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if (x<-1){
			System.out.print("y="+(3*x*x));
		}else if (-1<=x && x<=1){
			System.out.print("y="+(x*x*x+(3*x)-3));
		}else{
			System.out.print("y="+(2*x+3));
		}
	}

}
