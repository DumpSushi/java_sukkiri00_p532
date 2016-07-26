package p532;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
/*		// long
 * 		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time:" + (end-start) + "ms");
*/

/*		// Date
 * 		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1316622225935L);
		System.out.println(past);
*/

/*		// Calender
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");

		c.set(2010,  8, 22, 1,23, 45);
		c.set(Calendar.YEAR,  2011);
		Date past = c.getTime();
		System.out.println(past);
*/
		// SimpleDateFormat.
		Date now = new Date();
		SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		String s = f.format(now);
		System.out.println(s);
		Date d = f.parse("2011/09/22 01:23:45");
		System.out.println(d);
	}

}
