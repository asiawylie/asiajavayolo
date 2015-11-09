package java100;
import java.util.*;
public class dick49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		while(n>0){
			n=n/10;		
			k++;
		}
		System.out.print(k);
	}

}
