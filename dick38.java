package java100;
import java.util.*;
public class dick38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0){
			sum=n*(n+1)+sum;
			n--;
		}
		System.out.print(sum);
	}

}
