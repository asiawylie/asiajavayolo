package java100;
import java.util.*;
public class dick09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入性別和身高：");
		String sex=sc.next();
		float high=sc.nextInt();
		switch (sex){	
		case "男":
			System.out.print("男："+((high-170)*0.6+62));
			break;
		case "女":
			System.out.print("女："+((high-158)*0.5+52));
			break;
	}

}
}