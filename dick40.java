package java100;
import java.util.*;
public class dick40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0){
			sum=(int) Math.pow(2, n)+sum;
			n--;
		}
		System.out.print(sum);
	}

}
