package java100;
import java.util.*;
public class dick36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		int sum=1;
		while(k<=n){
			sum=sum*k;
			k++;
		}
		System.out.print(sum);
	}

}
