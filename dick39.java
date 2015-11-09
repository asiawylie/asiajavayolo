package java100;
import java.util.*;
public class dick39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double n=sc.nextInt();
		double sum=0;
		while (n>0){
			sum=1/((2*n-1)*(2*n))+sum;
			n--;
		}
		System.out.print((double)sum);
	}

}
