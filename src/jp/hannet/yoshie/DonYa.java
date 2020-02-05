package jp.hannet.yoshie;

import jp.hannet.yoshie.framework.GyouDon;
import jp.hannet.yoshie.framework.IDon;
import jp.hannet.yoshie.framework.TenDon;
import java.util.Scanner;

public class DonYa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("牛丼か天丼どっちにいたしましょうか？: ");
		String donname = scanner.next();
		
		IDon don = null;
		if("牛丼".equals(donname)) {
			don = new GyouDon();
		} else {
			don = new TenDon();
		}
		System.out.println(don.doService());
		
		
	}

}
