package java100;
import java.util.*;
public class dick01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0){
		sum=n%10+sum;
		n=n/10;
	}
		System.out.print(sum);
}
	
}