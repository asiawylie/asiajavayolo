package java100;
import java.util.*;
public class dick09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J�ʧO�M�����G");
		String sex=sc.next();
		float high=sc.nextInt();
		switch (sex){	
		case "�k":
			System.out.print("�k�G"+((high-170)*0.6+62));
			break;
		case "�k":
			System.out.print("�k�G"+((high-158)*0.5+52));
			break;
	}

}
}