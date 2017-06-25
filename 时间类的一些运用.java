/**
 * 
 */
package test625;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Timesupsj
 *下午8:20:59
 */
//巴黎时间比北京时间晚7个小时，纽约时间比北京时间晚12个小时，试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。
public class ShuChuShiJian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buffer = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			 date = sdf.parse(buffer);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar time = Calendar.getInstance();
		time.setTime(date);
		System.out.println("现在的北京时间为："+sdf.format(date));
		time.add(Calendar.HOUR_OF_DAY,12);
		System.out.println("现在的纽约时间为："+sdf.format(time.getTime()));
		time.setTime(date);//重新初始化time的时间
		time.add(Calendar.HOUR_OF_DAY, 7);
		System.out.println("现在的巴黎时间为："+sdf.format(time.getTime()));
		
		
		
		

	}

}
