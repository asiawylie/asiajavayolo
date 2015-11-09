package java100;
import java.util.*;
public class dick15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入身高(cm)及體重(kg)：");
		int cm=sc.nextInt();
		int kg=sc.nextInt();
		System.out.println("身高(英吋)："+((float)cm/2.54));
		System.out.print("體重(磅)："+((float)kg*0.454));
	}

}
