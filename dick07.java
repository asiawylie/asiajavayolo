package java100;
import java.util.*;
public class dick07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char vl=sc.next().charAt(0);
		int AsciiCode=(char)vl;
		if ((AsciiCode>=65) && (AsciiCode<=90))
			System.out.print(Character.toLowerCase(vl));
		else
			System.out.print(Character.toUpperCase(vl));
		
	}

}
