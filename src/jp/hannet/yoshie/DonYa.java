package jp.hannet.yoshie;

import jp.hannet.yoshie.framework.GyouDon;
import jp.hannet.yoshie.framework.IDon;
import jp.hannet.yoshie.framework.TenDon;
import java.util.Scanner;

public class DonYa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ãçò•Ç©ìVò•Ç«Ç¡ÇøÇ…Ç¢ÇΩÇµÇ‹ÇµÇÂÇ§Ç©ÅH: ");
		String donname = scanner.next();
		
		IDon don = null;
		if("ãçò•".equals(donname)) {
			don = new GyouDon();
		} else {
			don = new TenDon();
		}
		System.out.println(don.doService());
		
		
	}

}
